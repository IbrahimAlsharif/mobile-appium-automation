package pita;

public class ElementInfo {
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
