import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double CT = Double.parseDouble(scanner.nextLine());

        double NP = Double.parseDouble(scanner.nextLine());
        double NSD = Double.parseDouble(scanner.nextLine());
        double NTB = Double.parseDouble(scanner.nextLine());
        double NMI = Double.parseDouble(scanner.nextLine());
        double NTR = Double.parseDouble(scanner.nextLine());

        double P = 2.60;
        double SD = 3.00;
        double TB = 4.10;
        double MI = 8.20;
        double TR = 2.00;

        double AM = P * NP + SD * NSD + TB * NTB + MI * NMI + TR * NTR;
        double NT = NP + NSD + NTB + NMI + NTR;


        if (NT >= 50) {

            double D = (25 * AM) / 100;
            double TE = AM - D;
            double R = (10 * TE) / 100;
            double tpl1 = TE - R;

            if (tpl1 > CT) {
                System.out.printf("Yes! %.2f lv left.", (tpl1-CT));
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", (CT-tpl1));
            }
        } else {
            double R = (10 * AM) / 100;
            double tpl2 = AM - R;
            if (tpl2 > CT) {
                System.out.printf("Yes! %.2f lv left.", (tpl2-CT));
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", (CT-tpl2));
            }
        }
    }
}





