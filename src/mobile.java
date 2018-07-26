import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        Double n = Double.parseDouble(scanner.nextLine());

        Double price = -1.00;

        if (size.equals("small")) {
            if (fruit.equals("Watermelon")) {
                price = 112.00;
            } else if (fruit.equals("Mango")) {
                price = 73.32;
            } else if (fruit.equals("Pineapple")) {
                price = 84.20;
            } else if (fruit.equals("Raspberry")) {
                price = 40.00;
            }
        } else if (size.equals("big")) {
            if (fruit.equals("Watermelon")) {
                price = 143.50;
            } else if (fruit.equals("Mango")) {
                price = 98.00;
            } else if (fruit.equals("Pineapple")) {
                price = 5 * 24.8;
            } else if (fruit.equals("Raspberry")) {
                price = 76.00;

            }
        }
        if ((price * n) > 1000) {
            System.out.printf("%.2f lv.", ((price * n) - (0.5 * price * n)));
        } else if (((price * n) >= 400) && ((price * n) <= 1000)) {
            System.out.printf("%.2f lv.", ((price * n) - (0.15 * price * n)));
        } else {
            System.out.printf("%.2f lv.", (price * n));
        }
    }
}























