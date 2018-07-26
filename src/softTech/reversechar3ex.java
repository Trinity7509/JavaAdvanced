package softTech;

import java.util.Scanner;

public class reversechar3ex {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        char[] letters= new char[3];

        for(int i=0;i<3;i++)

            letters[i]=scanner.nextLine().charAt(0);

      for(int i=letters.length-1;i>=0;i--)
     System.out.print(letters[i]);


    }
}
