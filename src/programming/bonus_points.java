package programming;

import java.util.Scanner;

public class bonus_points {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double bonusScoure = 0.0;

        if (num <= 100) {
            bonusScoure = 5;
        }else if (num < 1000) {
            bonusScoure = (num * 20.0) / 100;
        }else {
            bonusScoure = (num * 10.0) / 100;
        }
        if (num % 2 == 0){
            bonusScoure = bonusScoure + 1;
        } else if (num % 5 == 0) {
            bonusScoure = bonusScoure + 2;
        }
        System.out.println(bonusScoure);
        System.out.println(num + bonusScoure);
    }
}
