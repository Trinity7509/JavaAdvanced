package advancedJava.intro;

import java.util.Scanner;

public class formatNum {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String line=scanner.nextLine();
        String[] token=line.split("\\s+");

        int a=Integer.parseInt(token[0]);
        double b=Double.parseDouble(token[1]);
        double c=Double.parseDouble(token[2]);

        //int a=scanner.nextInt();
        //float b=scanner.nextFloat();
        //float c=scanner.nextFloat();


        String hex=Integer.toHexString(a).toUpperCase();
        String numberInBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.printf("|%-10s|",hex);
        System.out.printf("%s",numberInBinary);
        System.out.printf("|%10.2f|",b);
        System.out.printf("%-10.3f|",c);
    }
}
