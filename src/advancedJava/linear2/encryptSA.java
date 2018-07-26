package advancedJava.linear2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class encryptSA {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());

        String[] lines= new String[n];

        for(int i=0;i<n;i++)
        {
            lines[i]=scanner.nextLine();
        }


    }
    public static int[] encryptArray(String[] lines)
    {
        int[] encryptArray=new int[lines.length];
        List<Character> vowels=new ArrayList<>();
        Collections.addAll(vowels,'o','e','i','u','a','O','E','I','U','A');

        for(int i=0;i<lines.length;i++)
        {
            int sum=0;

            for(int j=0;j<lines[i].length();j++)
            {
                if(vowels.contains(lines[i].charAt(j)))
                {
                    sum+=(int)lines[i].charAt(j)*lines[i].length();
                }
                else
                {
                    sum+=(int)lines[i].charAt(j)/lines[i].length();
                }
            }
            encryptArray[i]=sum;
        }
        return encryptArray;
    }

}
