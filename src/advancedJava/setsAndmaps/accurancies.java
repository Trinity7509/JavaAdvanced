package advancedJava.setsAndmaps;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class accurancies {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] numbers=scanner.nextLine().split(" ");
        HashMap<String,Integer> numbs=new HashMap<>();

        for (String numN:numbers) {
            if(!numbs.containsKey(numN))
            {
              numbs.put(numN,1);
            }
            else {
                numbs.put(numN, numbs.get(numN) + 1);
            }
        }
        for (String key:numbs.keySet()) {
            System.out.printf("%s - %s times%n",key,numbs.get(key));
            
        }

        }
}
