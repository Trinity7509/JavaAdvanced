package advancedJava.straemAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class upperString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        List<String> numbers=Arrays.stream(reader.readLine().split(" ")).
                collect(Collectors.toList());

        numbers.stream()
                .map(n->n.toUpperCase())
                .forEach(n -> System.out.print(n + " "));
    }
}
