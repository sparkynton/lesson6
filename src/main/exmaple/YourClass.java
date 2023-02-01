package exmaple;

public class YourClass <T> {
    T genericField;
    int objectId;
    String objectDescription;

    public YourClass(T genericField, int objectId, String objectDescription) {
        this.genericField = genericField;
        this.objectId = objectId;
        this.objectDescription = objectDescription;
    }

    public T getGenericField() {
        return genericField;
    }

    public void setGenericField(T genericField) {
        this.genericField = genericField;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getObjectDescription() {
        return objectDescription;
    }

    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
    }

    public void getGenericType() {
        System.out.println(genericField.getClass().getName());
    }
}
