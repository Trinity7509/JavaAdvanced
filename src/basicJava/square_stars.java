package basicJava;

import java.util.Scanner;

public class square_stars {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
         for (int r = 0; r < n; r++){
             System.out.print("*");
             for (int c = 0; c < n - 1; c++){
                 System.out.print(" *");
             }
            System.out.println();
        }

    }
}
