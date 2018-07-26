package advancedJava.companyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    //private static LinkedHashMap<String, LinkedList<Employee>> employees = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

       List<Employee> employees=new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] empl = reader.readLine().split("\\s+");

            String name = empl[0];
            double salary = Double.valueOf(empl[1]);
            String position = empl[2];
            String department = empl[3];
            //String email = "n/a";
            //int age = -1;
            Employee employee = null;
if(empl.length==4)
{
    employee=new Employee(name,salary,position,department);
}
            if (empl.length == 5) {

                if (empl[4].contains("@")) {
                    String email = empl[4];
                    employee=new Employee(name,salary,position,department,email);
                } else {
                    int age = Integer.valueOf(empl[4]);
                    employee=new Employee(name,salary,position,department,age);

                }
            }
            if (empl.length == 6) {
                 String email = empl[4];
                int age = Integer.valueOf(empl[5]);
                 employee = new Employee(name, salary, position, department, email, age);
            }


            employees.add(employee);

            //System.out.println();
        }

            //employees.stream().filter(e->e.getEmail().contains("@")).filter(e->e.getAge()>0).
            //sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
            //System.out.println(employees.toString());
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream()
        .sorted(Comparator.comparing(kvp->kvp.getValue().stream().mapToDouble(Employee::getSalary)
                .average().getAsDouble(),Comparator.reverseOrder()))
                .limit(1)
                .forEach(kvp -> {


                    System.out.println("Highest Average Salary: "+kvp.getKey());
                    kvp.getValue().stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder()))
                            .forEach(System.out::println);
                });
        //employees.entrySet().stream().sorted(Comparator.comparing(Employee::getSalary))
                //.forEach(System.out::println);


        }

    }


