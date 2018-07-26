package advancedJava.google;

public class Parents {

    private String parentName;
    private String parentBirth;


    public Parents(String parentName, String parentBirth) {
        this.parentName = parentName;
        this.parentBirth = parentBirth;
    }




    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentBirth() {
        return parentBirth;
    }

    public void setParentBirth(String parentBirth) {
        this.parentBirth = parentBirth;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s",this.parentName,this.parentBirth);
    }
}
