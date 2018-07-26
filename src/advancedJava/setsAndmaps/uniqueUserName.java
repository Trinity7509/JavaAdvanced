package advancedJava.setsAndmaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class uniqueUserName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        //String[] input=new String[n];

        LinkedHashSet<String> newNames=new LinkedHashSet<>();
       for(int i=0;i<n;i++)
      {
    String s =scanner.nextLine();
    newNames.add(s);

      }
     for(String newName:newNames)
     {
         System.out.println(newName);
     }
        }
    }

