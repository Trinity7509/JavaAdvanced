package advancedJava.intro;

import java.util.Scanner;

public class intro9 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n =scanner.nextInt();
        int p =scanner.nextInt();

        if(p>=n)
        {
            System.out.printf("0");
        }
        else
        {
            String binar =Integer.toBinaryString(n);
            String binary =new StringBuilder(binar).reverse().toString();

            if(binary.length()<p)
            {
                System.out.printf("0");
            }
            else
            {
                Character needNum=binary.charAt(p);
                System.out.println(needNum);
            }

        }


    }
}

