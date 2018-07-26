package softTech;

import java.util.Scanner;

public class vowelex4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String vowels="aioeu";
        char symbol=scanner.nextLine().charAt(0);
        if(Character.isDigit(symbol))
            System.out.println("digit");
        else if(vowels.contains(Character.toString(symbol)))
            System.out.println("vowel");
        else
            System.out.println("other");

    }
}
