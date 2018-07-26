package advancedJava.linear2;

import java.util.Scanner;

public class diagonalDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];
        int sumPrimary = 0;
        int sumSeconday = 0;

        for (int row = 0; row < n; row++) {
            String[] currentRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = Integer.parseInt(currentRow[col]);


            }
        }

        printMatrix(n, matrix, sumPrimary, sumSeconday);
}

    private static void printMatrix(int n, int[][] matrix, int sumPrimary, int sumSeconday) {
        for(int row=0;row<n;row++)
        {
            sumPrimary += matrix[row][row];

            sumSeconday += matrix[row][n - row - 1];
        }

        System.out.println(Math.abs(sumPrimary - sumSeconday));
    }
}
