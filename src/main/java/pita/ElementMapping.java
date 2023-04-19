package pita;

public class ElementMapping {
    private String methodName;
    private String locator;
    private boolean isClickable;
    private boolean hasTestData;
    private String productionArabicValue;
    private String productionEnglishValue;
    private String stagingArabicValue;
    private String stagingEnglishValue;

    public ElementMapping(String methodName, String locator, boolean isClickable, boolean hasTestData,
                          String productionArabicValue, String productionEnglishValue, String stagingArabicValue, String stagingEnglishValue) {
        this.methodName = methodName;
        this.locator = locator;
        this.isClickable = isClickable;
        this.hasTestData = hasTestData;
        this.productionArabicValue = productionArabicValue;
        this.productionEnglishValue = productionEnglishValue;
        this.stagingArabicValue = stagingArabicValue;
        this.stagingEnglishValue = stagingEnglishValue;
    }

    // Add getters for all properties
    public String getMethodName() {
        return methodName;
    }

    public String getLocator() {
        return locator;
    }

    public boolean isClickable() {
        return isClickable;
    }

    public boolean isHasTestData() {
        return hasTestData;
    }

    public String getProductionArabicValue() {
        return productionArabicValue;
    }

    public String getProductionEnglishValue() {
        return productionEnglishValue;
    }

    public String getStagingArabicValue() {
        return stagingArabicValue;
    }

    public String getStagingEnglishValue() {
        return stagingEnglishValue;
    }
}
