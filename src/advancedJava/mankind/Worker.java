package advancedJava.mankind;

import java.text.DecimalFormat;

public class Worker  extends Human{

    private static final String VALUE_MISMATCH="Expected value mismatch!Argument: weekSalary";
    private static final String HOURS_MISMATCH="Expected value mismatch!Argument: workHoursPerDay";
    private static final String NOT_LONG_ENOUGH="Expected length more than 3 symbols!Argument: lastName";

    private double salaryPerWeek;
    private double workingHours;

    private static int daysWeek=7;




    public Worker(String firstName, String lastName, double salaryPerWeek, double workingHours) {
        super(firstName, lastName);
        this.setSalaryPerWeek(salaryPerWeek);
        this.setWorkingHours(workingHours);
    }


    @Override
    protected void  setLastName(String lastName) throws IllegalArgumentException{
        String[] nameLA=lastName.split("");
        if(nameLA.length<=3)
        {
            throw new IllegalArgumentException(NOT_LONG_ENOUGH);
        }
         super.setLastName(lastName);
    }

    public double getSalaryPerWeek() {
        return salaryPerWeek;
    }

    private void setSalaryPerWeek(double salaryPerWeek) throws IllegalArgumentException {
        //DecimalFormat df=new DecimalFormat("#.##");
        if(salaryPerWeek<=10)
        {
            throw new IllegalArgumentException(VALUE_MISMATCH);
        }
        this.salaryPerWeek = salaryPerWeek;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    private void setWorkingHours(double workingHours) throws IllegalArgumentException {
        if(workingHours<1||workingHours>12)
        {
            throw new IllegalArgumentException(HOURS_MISMATCH);
        }
        this.workingHours = workingHours;
    }
    private double getSalaryPerHour()
    {
        double salaryPerHour=(this.salaryPerWeek/daysWeek)/this.workingHours;
        return salaryPerHour;
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.##");
        StringBuilder worker=new StringBuilder();
        worker.append(super.toString()).append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f",this.getSalaryPerWeek()))
                .append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f",this.getWorkingHours()))
                .append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%s",df.format(this.getSalaryPerHour())))
               ;

        return worker.toString();
    }
}
