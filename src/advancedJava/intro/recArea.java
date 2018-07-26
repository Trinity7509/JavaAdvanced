package advancedJava.intro;

import java.util.Scanner;

public class recArea {
    static void PrintArea(double n,double m)
    {

        double area = n*m;
        System.out.printf("%.2f",area);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
       PrintArea(n,m);
    }



}
