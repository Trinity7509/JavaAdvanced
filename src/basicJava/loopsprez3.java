package basicJava;

import java.util.Scanner;

public class loopsprez3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= n; i += 3){
            System.out.println(i);
        }
    }
}
