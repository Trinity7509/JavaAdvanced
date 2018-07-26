import java.util.Scanner;

public class yy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num > 10) {
            System.out.println("number too big");
        }else  if ( num == 1) {
            System.out.println("one");
        }

        }
}
