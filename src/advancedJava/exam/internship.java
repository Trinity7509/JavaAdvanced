package advancedJava.exam;

import javafx.animation.KeyValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class internship {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int sumNames = 0;
        int sumNamesS = 0;

        TreeMap<String, Integer> problems = new TreeMap<>();
        TreeMap<String, Integer> students = new TreeMap<>();


        for (int i = 0; i <= n; i++) {
            String problem = reader.readLine();

            //char[] problemName=problem.split().toString().toCharArray()
            char[] name = Arrays.stream(problem.split("")).toString().toCharArray();


            for (char nN :
                    name) {
                sumNames += (int) nN;
            }
            problems.put(problem, sumNames);
        }

        for (int i = n; i <= m; i++) {

            String nameS = reader.readLine();


            String regex = "([A-Z])\\w+";
            if (Pattern.matches(regex, nameS)) {

                //char[] problemName=problem.split().toString().toCharArray()
                char[] nameStudent = Arrays.stream(nameS.split("")).toString().toCharArray();


                for (char nS :
                        nameStudent) {
                    sumNamesS += (int) nS;
                }
                students.put(nameS, sumNamesS);
            } else {
               continue;
            }
        }
        for (String key:students.keySet()) {
            //if(students.get(key)>problems.get());
        }
    }
}

