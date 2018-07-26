package basicJava;

import java.util.Scanner;

public class examLate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minuteArrival = Integer.parseInt(scanner.nextLine());

        int AllminuteExam = 60 * hourExam + minuteExam;
        int AllminuteArrival = 60 * hourArrival + minuteArrival;


       // boolean Late1 = ( hourArrival > hourExam );
       // boolean Late2 = ( hourArrival == hourExam)&& ( minuteArrival > minuteExam);
        //boolean OnTime1 = ( hourArrival == hourExam)&& ( minuteArrival == minuteExam);
       // boolean OnTime2 = ( hourArrival -1 == hourExam ||hourArrival == hourExam )&& ( minuteArrival +30 < minuteExam||minuteArrival +30 == minuteExam );
        //boolean Early1 = ( hourArrival == hourExam)&&( minuteArrival +30 > minuteExam );
        //boolean Early2 = ( hourArrival -1 < hourExam );

        if(AllminuteArrival>AllminuteExam ) {
            System.out.println("Late");

            int DifAr = AllminuteArrival - AllminuteExam;
            double difHArr = Math.floor(DifAr / 60);
            double difMArr = DifAr - 60 * difHArr;

            if (DifAr < 59 || DifAr == 59) {
                System.out.printf("%d minutes after start", DifAr);
            } else {
                System.out.printf("%.0f:%.0f hours after the start", difHArr, difMArr);
            }


        }else if (AllminuteArrival< AllminuteExam) {

            int DifAr1 = AllminuteExam - AllminuteArrival;
            double difHArr1 = Math.floor(DifAr1 / 60);
            double difMArr1 = DifAr1 - 60 * difHArr1;

         if (AllminuteExam - AllminuteArrival > 30) {
             System.out.println("Early");

         }else if (DifAr1 < 59 || DifAr1 == 59) {
                System.out.printf("%d minutes before the start", AllminuteExam - AllminuteArrival);
            } else {
                System.out.printf("%f:%f hours before the start", difHArr1, difMArr1);
            }

        }else  if ((AllminuteExam - AllminuteArrival <=30)&& (AllminuteExam - AllminuteArrival > 0)) {

            System.out.printf("On time%n" + "%d minutes before the start", AllminuteExam - AllminuteArrival);
       } else {
           System.out.println("On time");











        }



    }


}
