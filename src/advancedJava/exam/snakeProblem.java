package advancedJava.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class snakeProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] commands = reader.readLine().split(", ");

        char[][] matrix = new char[n][n];
        int snakePower = 1;
        char start = 's';
        int currentX = 0;
        int currentY = 0;

        for (int i = 0; i < n; i++) {

            char[] currentLine = Arrays.stream(reader.readLine().split("\\s+")).toString().toCharArray();
            for (int j = 0; j < n; j++) {

                matrix[i][j] = currentLine[j];
            }

        }
        String line = reader.readLine();


        while (true) {


            for (int i = 0; i < n; i++) {
                char[] comandLine = Arrays.stream(line.split("\\s+")).toString().toCharArray();


                for (int j = 0; j < n; j++) {
                    char temporary = ' ';
                    if (matrix[i][j] == start) {
                        i = currentX;
                        j = currentY;
                        temporary = matrix[i][j];
                        matrix[i][j] = matrix[currentX][currentY];
                        matrix[currentX][currentY] = temporary;
                    }
                    for (String c : commands) {

                        switch (c) {
                            case "left":
                                currentX = currentX - 1;
                                //matrix[currentX - 1][currentY] = temporary;


                                if (temporary == 'e') {
                                    System.out.println("You lose! Killed by an enemy!");
                                    break;
                                } else if (temporary == 'f') {
                                    snakePower++;
                                    line = reader.readLine();
                                } else if (temporary == '*') {
                                    line = reader.readLine();

                                }

                                break;

                            case "right":
                                currentX = currentX + 1;
                                //temporary=matrix[currentX + 1][currentY] ;

                                if (temporary == 'e') {
                                    System.out.println("You lose! Killed by an enemy!");
                                    break;
                                } else if (temporary == 'f') {
                                    snakePower++;
                                    line = reader.readLine();
                                } else if (temporary == '*') {
                                    line = reader.readLine();

                                }

                                break;

                            case "up":
                                currentY = currentY + 1;
                                //matrix[currentX][currentY + 1] = temporary;


                                if (temporary == 'e') {
                                    System.out.println("You lose! Killed by an enemy!");
                                    break;
                                } else if (temporary == 'f') {
                                    snakePower++;
                                    line = reader.readLine();
                                } else if (temporary == '*') {
                                    line = reader.readLine();

                                }
                                break;

                            case "down":
                                currentY = currentY - 1;
                                //matrix[currentX][currentY - 1] = temporary;

                                if (temporary == 'e') {
                                    System.out.println("You lose! Killed by an enemy!");
                                    break;
                                } else if (temporary == 'f') {
                                    snakePower++;
                                    line = reader.readLine();
                                } else if (temporary == '*') {
                                    line = reader.readLine();

                                }
                                break;

                        }
                    }


                }


            }
            line = reader.readLine();




            for (char[] r : matrix) {
                for (int c : r) {

                    if ((c != 'f')) {
                        System.out.printf("You win! Final snake length is %s",snakePower);
                    }
                    else
                    {
                        System.out.printf("You lose! There is still %s food to be eaten.",snakePower);
                    }

                }

            }
        }
    }

}




