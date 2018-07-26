package advancedJava.prepExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class natureProphet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] num = reader.readLine().split(" ");

        int rows = Integer.parseInt(num[0]);
        int cols = Integer.parseInt(num[1]);

        int[][] matrix = new int[rows][cols];

        String line = reader.readLine();

        while (!"Bloom Bloom Plow".equalsIgnoreCase(line))

        {
            int[] coordinates=Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = coordinates[0];
            int y = coordinates[1];


            int counter = 1;

                    for (int i = 0; i < rows; i++) {

                        matrix[i][y] += 1;
                    }
                for (int j = 0; j < cols; j++) {

               if(y!=j) {
               matrix[x][j] += 1;
            }

                }





            line = reader.readLine();
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

