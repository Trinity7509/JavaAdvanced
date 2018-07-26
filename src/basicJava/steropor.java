package basicJava;

import java.util.Scanner;

public class steropor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());


        double hours = b*c*8;
        double cups = Math.floor(hours/5);

        if(cups <a) {

            double cupsl = a-cups;
            double loss = 4.2 *cupsl;

            System.out.printf("Losses: %.2f",loss);

        }else{
            double cupsp = cups-a;
            double profit = 4.2 *cupsp;
            System.out.printf("%.2f extra money",profit);
        }
        }


}
