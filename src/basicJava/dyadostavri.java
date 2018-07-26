package basicJava;

import java.util.Scanner;

public class dyadostavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double kol = 0;
        double gr = 0;
        double allKol = 0;
        double gradus = 0;
        double allGr = 0;
        double totalGr = 0;
        for (int i = 1; i <= n; i++)
        {
            kol = Double.parseDouble(scanner.nextLine());
            gr = Double.parseDouble(scanner.nextLine());
            gradus = kol * gr;
            allKol += kol;
            allGr += gradus;
        }
        totalGr = allGr / allKol;
        System.out.printf("Liter: %.2f\n", allKol);
        System.out.printf("Degrees: %.2f\n", totalGr);
        if (totalGr < 38)
        {
            System.out.println("Not good, you should baking!");
        }
        else if (totalGr >= 38 && totalGr <= 42)
        {
            System.out.println("Super!");
        }
        else if (totalGr > 42)
        {
            System.out.println("Dilution with distilled water!");
        }

    }
}
