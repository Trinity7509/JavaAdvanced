package advancedJava.mankind;

public class Student extends Human{
    private static final String INVALID_NUMBER="Invalid faculty number!";
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) throws IllegalArgumentException{
        String[] num=facultyNumber.split("");
        if(num.length<5||num.length>10)
        //if(facultyNumber%10000<9.99&&facultyNumber%1000000000>9.99)
        {
            throw new IllegalArgumentException(INVALID_NUMBER);
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder student=new StringBuilder();
        student.append(super.toString()).append(System.lineSeparator())
                .append("Faculty number: ").append(this.getFacultyNumber());


        return student.toString();
    }
}
