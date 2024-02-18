package MementoDesignPattern;

public class ConfigOriginator {

    int productVersion;
    int majorTag;

    int minorTag;

    public ConfigOriginator(int productVersion, int majorTag) {
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

    public int getMinorTag() {
        return minorTag;
    }

    public void setMinorTag(int minorTag) {
        this.minorTag = minorTag;
    }

    public ConfigMemento createMemento(){
        return new ConfigMemento(this.productVersion, this.majorTag);
    }

    public void restoreMemento(ConfigMemento configMemento){
        this.productVersion = configMemento.getProductVersion();
        this.majorTag = configMemento.getMajorTag();
    }
}
