package advancedJava.intro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class firstOddandEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lineOne = scanner.nextLine();
        String lineTwo = scanner.nextLine();

        String[] tokenOne = lineOne.split("\\s+");
        String[] tokenTwo = lineTwo.split("\\s+");
         Integer counter =1;
         int n=Integer.parseInt(tokenTwo[1]);


        List<String> numbers = new ArrayList<>();
        for (String num:tokenOne) {

            String oddEven = tokenTwo[2];
            //int nextNum = Integer.parseInt(tokenOne[i]);

            //String[] number = new String[Integer.parseInt(lengthNew)];


            if ("odd".equals(oddEven)&&n>=counter) {
                if (Integer.parseInt(num) % 2 != 0) {
                    numbers.add(num);
                    counter++;
                }
            }
             else if ("even".equals(oddEven)&&n>=counter) {
                if (Integer.parseInt(num) % 2 == 0) {
                    numbers.add(num);
                    counter++;
                }

            }
        }
        for(String newNum:numbers)
            //System.out.print(numbers.toString().replaceAll("[\\]\\[,]", ""));
        //System.out.print(numbers.replaceAll("[\\]\\[,]", ""));
        System.out.printf("%d ",Integer.parseInt(newNum));



    }
}
