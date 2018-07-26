package advancedJava.linear2;

import java.util.Scanner;

public class polindroms {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String[]token=scanner.nextLine().split("\\s+");

        int row =Integer.parseInt(token[0]);
        int col=Integer.parseInt(token[1]);

        String[][]matrix=new String[row][col];
         char startingChar='a';


        createMatrix(row, col, matrix, startingChar);


        printMatrix(row, col, matrix);
    }

    private static void printMatrix(int row, int col, String[][] matrix) {
        for(int rows=0;rows<row;rows++)
{
    for(int cols=0;cols<col;cols++)
    {
        System.out.print(matrix[rows][cols]+" ");
    }
    System.out.println();
}
    }

    private static void createMatrix(int row, int col, String[][] matrix, char startingChar) {
        for(int i=0;i<row;i++)
        {
            for(int j = 0; j<col;j++)
            {
        matrix[i][j]=startingChar+""+(char)(startingChar+j)+startingChar;
            }
            startingChar++;
        }
    }

}


