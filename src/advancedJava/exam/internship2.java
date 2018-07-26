package advancedJava.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.regex.Pattern;

public class internship2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String regex="([A-Z])\\w+";
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        Deque<String> problemsStack = new ArrayDeque<>();
        Deque<String> namesStudents = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            problemsStack.push(line);
        }

        for (int i = n; i < m; i++) {
            String line = reader.readLine();

            String regex = "([A-Z])\\w+";
            if (Pattern.matches(regex, line)) {
                namesStudents.offer(line);
            }
        }

        while ((problemsStack.isEmpty() && namesStudents.isEmpty())) {
            namesStudents.poll();

        }
    }
}

