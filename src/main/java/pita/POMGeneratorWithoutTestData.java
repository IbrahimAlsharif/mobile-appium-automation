package pita;

import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class POMGeneratorWithoutTestData {

    public static void main(String[] args) {
        // Read elements without test data from a file
        Map<String, ElementInfo> elementsNoTestData = readElementMappingsFromFile("src/main/java/pita/element_mappings.txt");

        // Generate POM class without test data
        String pomCodeNoTestData = generatePOMMethodsNoTestData("OtherPage", elementsNoTestData);
        System.out.println(pomCodeNoTestData);
    }

    public static String generatePOMMethodsNoTestData(String className, Map<String, ElementInfo> elements) {
        StringBuilder pomCode = new StringBuilder();

        // Class header
        pomCode.append("public class ").append(className).append(" {\n\n");

        // serviceProviderMobileFinder instance
        pomCode.append("    private ServiceProviderMobileFinder serviceProviderMobileFinder;\n\n");

        // Element getter methods
        for (Map.Entry<String, ElementInfo> entry : elements.entrySet()) {
            String elementName = entry.getKey();
            String xpath = entry.getValue().getXpath();
            boolean isClickable = entry.getValue().isClickable();

            pomCode.append("    public MobileElement get").append(capitalize(elementName)).append("() {\n");
            pomCode.append("        String xpath = \"").append(xpath).append("\";\n");
            pomCode.append("        return serviceProviderMobileFinder.getByXpath(xpath, ").append(isClickable).append(");\n");
            pomCode.append("    }\n\n");

            pomCode.append("    public boolean ").append(elementName).append("IsDisplayed() {\n");
            pomCode.append("        return get").append(capitalize(elementName)).append("().isDisplayed();\n");
            pomCode.append("    }\n\n");
        }

        // Class end
        pomCode.append("}");

        return pomCode.toString();
    }

    private static String capitalize(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
    public static Map<String, ElementInfo> readElementMappingsFromFile(String filePath) {
        Map<String, ElementInfo> elements = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 3);
                if (parts.length == 3) {
                    elements.put(parts[0].trim(), new ElementInfo(parts[1].trim(), Boolean.parseBoolean(parts[2].trim())));
                    System.out.println("Line " + lineNumber + ": Added element mapping (" + parts[0].trim() + ", " + parts[1].trim() + ", " + parts[2].trim() + ")");
                } else {
                    System.err.println("Line " + lineNumber + ": Invalid element mapping format - " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return elements;
    }

    public static class ElementInfo {
        private String xpath;
        private boolean isClickable;

        public ElementInfo(String xpath, boolean isClickable) {
            this.xpath = xpath;
            this.isClickable = isClickable;
        }

        public String getXpath() {
            return xpath;
        }

        public boolean isClickable() {
            return isClickable;
        }
    }
}


