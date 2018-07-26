package advancedJava.google;

import java.text.DecimalFormat;

public class Company {

    private String companyName;
    private String departmentName;
    double salary;

    public Company(String companyName, String departmentName, double salary) {
        this.companyName = companyName;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return String.format(
                "%s %s %.2f",this.companyName,this.departmentName,this.salary);
    }
}
