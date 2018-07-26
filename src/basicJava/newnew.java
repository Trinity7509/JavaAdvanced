package basicJava;

import java.util.Scanner;

public class newnew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        Double n = Double.parseDouble(scanner.nextLine());

        Double price = 1.00;
        Double X = 0.0;
        Double a = price * n;


        if (size.equals("small")) {
            if (fruit.equals("Watermelon")) {
                price = 112.00;
            } else if (fruit.equals("Mango")) {
                price = 73.32;
            } else if (fruit.equals("Ananas")) {
                price = 84.20;
            } else if (fruit.equals("Raspberry")) {
                price = 40.00;
            }
        } else if (size.equals("big")) {
            if (fruit.equals("Watermelon")) {
                price = 143.50;
            } else if (fruit.equals("Mango")) {
                price = 98.00;
            } else if (fruit.equals("Ananas")) {
                price = 5 * 24.8;
            } else if (fruit.equals("Raspberry")) {
                price = 76.00;
              }
            }
            if ((a) > 1000) {
                X = a - (0.5 * a);
                System.out.printf("%.2f lv.", X);
            } else if (((a) > 400) && ((a) < 1000)) {
                X = (a) - (0.15 * a);
                System.out.printf("%.2f lv.", X);
            } else {
                X = (price * n);
                System.out.printf("%.2f lv.", X);
            }
        }
    }


