package API;

public class City {
    private float id;
    private String name;
    Label LabelObject;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Label getLabel() {
        return LabelObject;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabel(Label labelObject) {
        this.LabelObject = labelObject;
    }
}
