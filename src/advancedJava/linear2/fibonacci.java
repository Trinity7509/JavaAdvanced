package advancedJava.linear2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        long fibonacci= getFibonacci(n+1);

        System.out.println(fibonacci);
    }

    private static long getFibonacci(int n) {


        if(n==1)
        {
             return 1;
        }
        else if (n==0)
        {
            return 0;
        }
        else
        {

            return  getFibonacci(n-1)+getFibonacci(n-2);
        }
    }
}
