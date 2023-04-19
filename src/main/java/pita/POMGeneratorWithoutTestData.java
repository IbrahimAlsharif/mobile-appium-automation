package pita;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class POMGeneratorWithoutTestData {

    public static void main(String[] args) {
//        // Read elements without test data from a file
//        Map<String, ElementInfo> elementsNoTestData = readElementMappingsFromFile("src/main/java/pita/element_mappings.txt");
//
//        // Generate POM class without test data
//        String pomCodeNoTestData = generatePOMMethodsNoTestData("OtherPage", elementsNoTestData);
//        System.out.println(pomCodeNoTestData);

        // Read element mappings from a file
        List<ElementMapping> elementMappings = readElementMappingsFromFile("src/main/java/pita/element_mappings.txt");

        // Generate ITestData interface and implementing classes
        generateTestDataClasses(elementMappings);
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

//    public static void generateTestDataClasses(Set<String> elementNames) {
//        String[] environments = {"ProductionArabic", "ProductionEnglish", "StagingArabic", "StagingEnglish"};
//
//        // Generate ITestData interface
//        StringBuilder interfaceCode = new StringBuilder();
//        interfaceCode.append("public interface ITestData {\n\n");
//
//        for (String elementName : elementNames) {
//            interfaceCode.append("    String get").append(capitalize(elementName)).append("();\n");
//        }
//
//        interfaceCode.append("}\n");
//
//        System.out.println(interfaceCode.toString());
//
//        // Generate implementing classes
//        for (String environment : environments) {
//            StringBuilder classCode = new StringBuilder();
//            classCode.append("public class ").append(environment).append(" implements ITestData {\n\n");
//
//            for (String elementName : elementNames) {
//                classCode.append("    @Override\n");
//                classCode.append("    public String get").append(capitalize(elementName)).append("() {\n");
//                classCode.append("        return \"\"; // Replace with the actual value for ").append(environment).append("\n");
//                classCode.append("    }\n\n");
//            }
//
//            classCode.append("}\n");
//
//            System.out.println(classCode.toString());
//        }
//    }

    //لقراءة الملف النصي الموجود في element_mappings.txt
    public static List<ElementMapping> readElementMappingsFromFile(String filePath) {
        List<ElementMapping> elementMappings = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) {
                    // Ignore empty lines and lines starting with "#"
                    continue;
                }

                String[] parts = line.split(",", 8);
                if (parts.length == 8) {
                    String methodName = parts[0].trim();
                    String locator = parts[1].trim();
                    boolean isClickable = Boolean.parseBoolean(parts[2].trim());
                    boolean hasTestData = Boolean.parseBoolean(parts[3].trim());
                    String productionArabicValue = parts[4].trim();
                    String productionEnglishValue = parts[5].trim();
                    String stagingArabicValue = parts[6].trim();
                    String stagingEnglishValue = parts[7].trim();

                    ElementMapping elementMapping = new ElementMapping(methodName, locator, isClickable, hasTestData,
                            productionArabicValue, productionEnglishValue, stagingArabicValue, stagingEnglishValue);

                    elementMappings.add(elementMapping);
                } else {
                    System.err.println("Invalid element mapping format - " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return elementMappings;
    }
    public static void generateTestDataClasses(List<ElementMapping> elementMappings) {
        String[] environments = {"ProductionArabic", "ProductionEnglish", "StagingArabic", "StagingEnglish"};

        // Generate ITestData interface
        StringBuilder interfaceCode = new StringBuilder();
        interfaceCode.append("public interface ITestData {\n\n");

        for (ElementMapping elementMapping : elementMappings) {
            if (elementMapping.isHasTestData()) {
                interfaceCode.append("    String get").append(capitalize(elementMapping.getMethodName())).append("();\n");
            }
        }

        interfaceCode.append("}\n");

        System.out.println(interfaceCode.toString());

        // Generate implementing classes
        for (String environment : environments) {
            StringBuilder classCode = new StringBuilder();
            classCode.append("public class ").append(environment).append(" implements ITestData {\n\n");

            for (ElementMapping elementMapping : elementMappings) {
                if (elementMapping.isHasTestData()) {
                    classCode.append("    @Override\n");
                    classCode.append("    public String get").append(capitalize(elementMapping.getMethodName())).append("() {\n");
                    classCode.append("        return \"").append(getValueForEnvironment(elementMapping, environment)).append("\";\n");
                    classCode.append("    }\n\n");
                }
            }

            classCode.append("}\n");
            System.out.println(classCode.toString());
        }
    }

    //من كلاس ElementMapping بتم اخذ القيم الاربعة
    private static String getValueForEnvironment(ElementMapping elementMapping, String environment) {
        switch (environment) {
            case "ProductionArabic":
                return elementMapping.getProductionArabicValue();
            case "ProductionEnglish":
                return elementMapping.getProductionEnglishValue();
            case "StagingArabic":
                return elementMapping.getStagingArabicValue();
            case "StagingEnglish":
                return elementMapping.getStagingEnglishValue();
            default:
                return "";
        }
    }

    private static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

//    public static Set<String> readElementNamesWithTestData(String filePath) {
//        Set<String> elementNames = new HashSet<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                line = line.trim();
//                if (line.isEmpty() || line.startsWith("#")) {
//                    // Ignore empty lines and lines starting with "#"
//                    continue;
//                }
//
//                String[] parts = line.split(",", 4);
//                if (parts.length == 4) {
//                    if (Boolean.parseBoolean(parts[3].trim())) {
//                        elementNames.add(parts[0].trim());
//                    }
//                } else {
//                    System.err.println("Invalid element mapping format - " + line);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return elementNames;
//    }
    ////////////////////
//    public static Map<String, ElementInfo> readElementMappingsFromFile(String filePath) {
//        Map<String, ElementInfo> elements = new HashMap<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            int lineNumber = 1;
//            while ((line = reader.readLine()) != null) {
//                line = line.trim();
//                if (line.isEmpty() || line.startsWith("#")) {
//                    // Ignore empty lines and lines starting with "#"
//                    continue;
//                }
//
//                String[] parts = line.split(",", 3);
//                if (parts.length == 3) {
//                    elements.put(parts[0].trim(), new ElementInfo(parts[1].trim(), Boolean.parseBoolean(parts[2].trim())));
//                    System.out.println("Line " + lineNumber + ": Added element mapping (" + parts[0].trim() + ", " + parts[1].trim() + ", " + parts[2].trim() + ")");
//                } else {
//                    System.err.println("Line " + lineNumber + ": Invalid element mapping format - " + line);
//                }
//                lineNumber++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return elements;
//    }

    //تم استبدال هذه الكلاس بكلاس خارجي اسمه ElementMapping
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


