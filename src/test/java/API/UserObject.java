package API;


public class UserObject {
    Data DataObject;
    Meta MetaObject;


    // Getter Methods

    public Data getData() {
        return DataObject;
    }

    public Meta getMeta() {
        return MetaObject;
    }

    // Setter Methods

    public void setData(Data dataObject) {
        this.DataObject = dataObject;
    }

    public void setMeta(Meta metaObject) {
        this.MetaObject = metaObject;
    }
}

