package MementoDesignPattern;

public class ConfigMemento {
    int productVersion;
    int majorTag;


    public ConfigMemento(int productVersion, int majorTag) {
        this.productVersion = productVersion;
        this.majorTag = majorTag;
    }

    public int getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(int productVersion) {
        this.productVersion = productVersion;
    }

    public int getMajorTag() {
        return majorTag;
    }

    public void setMajorTag(int majorTag) {
        this.majorTag = majorTag;
    }

}
