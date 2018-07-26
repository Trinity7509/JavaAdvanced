package advancedJava.setsAndmaps;

import java.util.HashSet;
import java.util.Scanner;

public class parkingLot {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        HashSet<String> parkingLot=new HashSet<>();

        while(true)
        {
            String input=scanner.nextLine();
            String[] reminder=input.split(", ");
            if("END".equals(reminder[0]))
            {
                break;
            }

            String command = reminder[0];
            String carNumber = reminder[1];

            switch (command) {
                case "IN":
                    parkingLot.add(carNumber);
                    break;
                case "OUT":
                    parkingLot.remove(carNumber);

            }



        }
        if(parkingLot.isEmpty())
        {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car: parkingLot) {
                System.out.println(car);
            }


        }

    }
}
