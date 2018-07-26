package advancedJava.linear2;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(matrixSize[0]);
        int m = Integer.parseInt(matrixSize[1]);

        int[][] matrix=new int[n][m];

        for(int i=0;i<n;i++)
        {
            String[] currentRow = scanner.nextLine().split("\\s+");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(currentRow[j]);
            }
        }


        Integer max = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol=0;

        for(int row=0;row<matrix.length-2;row++)
        {
            for(int col=0;col<matrix[0].length-2;col++){

                int sum  = matrix[row][col]+matrix[row][col+1]+matrix[row][col+2]+
                        matrix[row+1][col]+matrix[row+1][col+1]+matrix[row+1][col+2]  +
                        matrix[row+2][col]+matrix[row+2][col+1]+matrix[row+2][col+2];
                if (max < sum) {
                    max = sum;
                    startRow = row;
                    startCol = col;

                }

            }


        }


        System.out.printf("Sum = %d%n",max);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.printf(matrix[startRow+i][startCol+j]+" ");

            }
            System.out.println();
        }
    }







}