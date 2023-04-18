package pita;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class POMGenerator {

    public static void main(String[] args) {
        Map<String, String> elements = new HashMap<>();
        elements.put("notificationButton", "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]");
        elements.put("famcareLogo", "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
        elements.put("availabilitySwitcher", "//android.view.View[@content-desc=\"غير متاح\"]");

        String pomCode = generatePOMMethods("HomeScreen", elements);
        System.out.println(pomCode);

        System.out.println("----");

        Map<String, String[]> testDataValues = new HashMap<>();
        testDataValues.put("ProductionArabicData", new String[]{"اسم المستخدم", "كلمة المرور", "تسجيل"});
        testDataValues.put("ProductionEnglishData", new String[]{"Username", "Password", "Login"});
        testDataValues.put("StagingArabicData", new String[]{"اسم المستخدم (مرحلة التجربة)", "كلمة المرور (مرحلة التجربة)", "تسجيل"});
        testDataValues.put("StagingEnglishData", new String[]{"Username (Staging)", "Password (Staging)", "Login"});

        String interfaceCode = generateInterfaceMethods("ITestData", testDataValues.keySet());
        System.out.println(interfaceCode);

        System.out.println("----");

        for (Map.Entry<String, String[]> entry : testDataValues.entrySet()) {
            String className = entry.getKey();
            String[] values = entry.getValue();
            String testDataCode = generateImplementationMethods(className, "ITestData", values);
            System.out.println(testDataCode);
            System.out.println("----");
        }
    }

    public static String generatePOMMethods(String className, Map<String, String> elements) {
        StringBuilder pomCode = new StringBuilder();

        // Class header
        pomCode.append("public class ").append(className).append(" {\n\n");

        // Appium driver
        pomCode.append("    private AppiumDriver<MobileElement> driver;\n\n");

        // Element definitions
        for (Map.Entry<String, String> entry : elements.entrySet()) {
            String elementName = entry.getKey();
            String xpath = entry.getValue();
            pomCode.append("    private By ").append(elementName)
                    .append(" = By.xpath(\"").append(xpath).append("\");\n");
        }
        pomCode.append("\n");

        // Constructor
        pomCode.append("    public ").append(className).append("(AppiumDriver<MobileElement> driver) {\n");
        pomCode.append("        this.driver = driver;\n");
        pomCode.append("    }\n\n");

        // Getter methods
        for (String elementName : elements.keySet()) {
            String methodName = "get" + capitalizeFirstLetter(elementName);
            pomCode.append("    public MobileElement ").append(methodName).append("() {\n");
            pomCode.append("        return driver.findElement(").append(elementName).append(");\n");
            pomCode.append("    }\n\n");
        }

        // Closing brace for the class
        pomCode.append("}");

        return pomCode.toString();
    }

    private static String capitalizeFirstLetter(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static String generateInterfaceMethods(String interfaceName, Set<String> methodNames) {
        StringBuilder code = new StringBuilder();

        code.append("public interface ").append(interfaceName).append(" {\n\n");

        for (String methodName : methodNames) {
            code.append("    String ").append(methodName).append("();\n");
        }

        code.append("\n}");

        return code.toString();
    }

    public static String generateImplementationMethods(String className, String interfaceName, String[] values) {
        StringBuilder code = new StringBuilder();

        code.append("public class ").append(className).append(" implements ").append(interfaceName).append(" {\n\n");

        int index = 0;
        for (String methodName : values) {
            code.append("    @Override\n");
            code.append("    public String ").append(methodName).append("() {\n");
            code.append("        return \"").append(values[index]).append("\";\n");
            code.append("    }\n\n");
            index++;
        }

        code.append("}");

        return code.toString();
    }
}

