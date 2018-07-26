package advancedJava.intro;

import java.util.Scanner;

public class hitTheTarget {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());


        for(int i=1;i<=20;i++)

        {
            for(int j=1;j<=20;j++) {
                if (n == i+j)
                {
                    System.out.printf("%s + %s = %s", i, j, n);
                    System.out.println();
                }
                if(n==i-j)
                {
                    System.out.printf("%s - %s = %s", i, j, n);
                    System.out.println();
                }
            }
        }
    }
}
