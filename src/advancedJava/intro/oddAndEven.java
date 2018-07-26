package advancedJava.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oddAndEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String line=scanner.nextLine();
        String[] token= line.split("\\s+");

     if(token.length%2==0)
       {
        for(int i=0;i<token.length;i+=2)
         {
           int firstSymbol=Integer.parseInt(token[i]);
           int nextSymbol=Integer.parseInt(token[i+1]);

           if(firstSymbol%2==0 && nextSymbol%2==0)
           {
               System.out.printf("%s, %s -> both are even",firstSymbol,nextSymbol);
               System.out.println();
           }
           else if (firstSymbol%2!=0 && nextSymbol%2!=0)
           {
               System.out.printf("%s, %s -> both are odd",firstSymbol,nextSymbol);
               System.out.println();
           }
           else
           {
               System.out.printf("%s, %s -> different",firstSymbol,nextSymbol);
               System.out.println();
           }
          }
         }
         else
     {
         System.out.println("invalid length");
     }

    }
}
