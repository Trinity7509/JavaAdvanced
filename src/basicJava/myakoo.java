package basicJava;

import java.util.Scanner;

public class myakoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        int count =0;

        String password = "";
        boolean passwordIsFound = false;

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9 ; j++){
                for (int k = 1; k <= 9; k++){
                    for (int l = 1; l <= 9; l++){

                        if (i < j && k > l){
                            if (i * j + k * l == n){
                                count++;
                                System.out.printf("%d%d%d%d", i, j, k, l);
                                if (count == 4){
                                    password = String.format("%d%d%d%d", i, j, k, l);
                                    passwordIsFound = true;
                                }

                            }
                        }
                    }
                }
            }
        }


        //System.out.println(a*b);
    }
}
