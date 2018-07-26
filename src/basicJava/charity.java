package basicJava;

import java.util.Scanner;

public class charity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double RecordSec = Double.parseDouble(scanner.nextLine());
        double LengthM = Double.parseDouble(scanner.nextLine());
        double TimeSecM = Double.parseDouble(scanner.nextLine());

        double TimeBasic = LengthM * TimeSecM;
        double TimeAdd = Math.floor( LengthM / 15.00 ) * 12.50;
        double TimeTotal = TimeBasic + TimeAdd  ;
        double TimeDif = TimeTotal - RecordSec ;

        if ( RecordSec <= TimeTotal){
            System.out.printf("No, he failed! He was %.2f seconds slower.", TimeDif);
        } else if(RecordSec > TimeTotal){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", TimeTotal);
        }

    }


}
