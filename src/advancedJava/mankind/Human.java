package advancedJava.mankind;

public class Human {

    private static final String NO_UPPERCASE_LETTER="Expected upper case letter!Argument: firstName";
    private static final String NEED_LONGER_FIRST_NAME="Expected length at least 4 symbols!Argument: firstName";
    private static final String NO_UPPERCASE_START="Expected upper case letter!Argument: lastName";
    private static final String NEED_LONGER_LAST_NAME="Expected length at least 3 symbols!Argument: lastName";


    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName)  throws IllegalArgumentException {
        String[] name=firstName.split("");
        if(Character.isLowerCase(name[0].charAt(0)))
        {
            throw new IllegalArgumentException(NO_UPPERCASE_LETTER);
        }
        else if(name.length<4)
        {
            throw new IllegalArgumentException(NEED_LONGER_FIRST_NAME);
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) throws IllegalArgumentException {
        String[] nameL=lastName.split("");
        if(Character.isLowerCase(nameL[0].charAt(0)))
        {
            throw new IllegalArgumentException(NO_UPPERCASE_START);
        }
        else if(nameL.length<3)
        {
            throw new IllegalArgumentException(NEED_LONGER_LAST_NAME);
        }
        this.lastName = lastName;
    }

    @Override
    public String toString() {
    StringBuilder sb=new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName());



        return sb.toString();
    }
}
