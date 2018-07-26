import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Biticoin = Double.parseDouble(scanner.nextLine());
        double Juan = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());

        double lev1 = Biticoin * 1168.00;
        double dollar = Juan * 0.15;
        double lev2 = dollar * 1.76;

        double Tlev = lev1 + lev2;
        double euro = Tlev / 1.95;
        double AmComission = euro * (commision / 100);
        double Result = euro - AmComission;

        System.out.printf("%.2f", Result);

    }

}
