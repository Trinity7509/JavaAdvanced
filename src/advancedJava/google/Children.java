package advancedJava.google;

public class Children {

    private String childName;
    private String childBirth;

    public Children(String childName, String childBirth) {
        this.childName = childName;
        this.childBirth = childBirth;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildBirth() {
        return childBirth;
    }

    public void setChildBirth(String childBirth) {
        this.childBirth = childBirth;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s",this.childName,this.childBirth);
    }
}
