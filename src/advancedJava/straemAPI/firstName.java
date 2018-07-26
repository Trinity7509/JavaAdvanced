package advancedJava.straemAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class firstName {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));


        List<String> names=Arrays.asList(reader.readLine().split("\\s+"));

        Set<Character> letters=new HashSet<>();

        Arrays.stream(reader.readLine().split("\\s+"))
                .map(n->Character.toLowerCase(n.charAt(0)))
                .forEach(letters::add);

        Optional<String> namesFinal
        =names.stream().
                filter(n->letters.contains(Character.toLowerCase(n.charAt(0)))).
                sorted().
                findFirst();

        if(namesFinal.isPresent())
        {
            System.out.println(namesFinal.get());
        }
        else
        {
            System.out.println("No match");
        }




    }
}
