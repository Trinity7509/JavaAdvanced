import java.util.Scanner;

public class xx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if ( grade >= 5.5) {
            System.out.println("Excellent!");
        }
        else {
            System.out.println("Not excellent.");
        }
    }
}
