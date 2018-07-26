package advancedJava.setsAndmaps;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.Scanner;
import java.util.TreeMap;

public class academyGraduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        TreeMap<String,Double> studentGr=new TreeMap<>();

        for(int i=0;i<n;i++)
        {
            String nameStudent=scanner.nextLine();
            String[] marks=scanner.nextLine().split("\\s+");

            double sum=0;

            for (String mark:marks) {
                sum+=Double.parseDouble(mark);

            }
            double average=sum/marks.length;
            studentGr.put(nameStudent,average);

        }

        for (String student:studentGr.keySet()) {
            System.out.printf("%s is graduated with %s%n",student,studentGr.get(student));
        }


    }
}
