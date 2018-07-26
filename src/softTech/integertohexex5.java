package softTech;
import java.util.Scanner;


public class integertohexex5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String hexNumer=Integer.toHexString(n);
        String binaryNum=Integer.toBinaryString(n);

        System.out.println(hexNumer.toUpperCase());
        System.out.println(binaryNum);

    }
}
