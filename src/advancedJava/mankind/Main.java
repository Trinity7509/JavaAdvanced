package advancedJava.mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String studentInfo=reader.readLine();
            String[] student=studentInfo.split("\\s+");
            String firstStudentN=student[0];
            String secondStudentN=student[1];
            String facultyNum=student[2];

            String workerInfo=reader.readLine();
            String[]worker=workerInfo.split("\\s+");
            String firstWorkerN=worker[0];
            String lastWorkerN=worker[1];
            double salaryPerWeek=Double.parseDouble(worker[2]);
            double workingHours=Double.parseDouble(worker[3]);

            //Human humanStudent=new Human(firstStudentN,secondStudentN);

            //Human humanWorker=new Human(firstWorkerN,lastWorkerN);

            Human student1=new Student(firstStudentN,secondStudentN,facultyNum);
            Human worker1=new Worker(firstWorkerN,lastWorkerN,salaryPerWeek,workingHours);

           // System.out.println(humanStudent.toString());
            System.out.println(student1.toString());
            //System.out.println(humanWorker.toString());
            System.out.println(worker1.toString());

        } catch (IllegalArgumentException error)

        {
            System.out.println(error.getMessage() );
        }


    }
}
