package advancedJava.straemAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




public class takeTwo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers=Arrays.stream(reader.readLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        numbers.stream()
                .filter(n ->10<=n&&n<=20)
                .distinct()
                .limit(2)
                .forEach(n ->System.out.print(n +" "));



    }
}
