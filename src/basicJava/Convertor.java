package basicJava;

import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());

        String from = scanner.nextLine();
        String to = scanner.nextLine();


        if ("USD".equals(from)) {
            value = value * 1.79549;

        } else if ("EUR".equals(from)) {
            value = value * 1.95583;

        } else if ("GBP".equals(from)) {
            value = value * 2.53405;
        }
        if ("USD".equals(to)) {
            value = value / 1.79549;

        } else if ("EUR".equals(to)) {
            value = value / 1.95583;

        } else if ("GBP".equals(to)) {
            value = value / 2.53405;
           //System.out.println("%.2f %s",value,to);
        }
    }


}
