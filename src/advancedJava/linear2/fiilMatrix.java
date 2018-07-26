package advancedJava.linear2;

import java.util.Scanner;

public class fiilMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[]token=scanner.nextLine().split(",\\s+");

        int rows=Integer.parseInt(token[0]);
        String type=token[1];

        int[][]matrix=new int[rows][];

        if(type.equals("A"))
        {
            matrix=calculateTypeA(rows);
        }
       if(type.equals("B"))
        { matrix=calculateTypeB(rows);
        }
        printMatrix(rows, matrix);



    }

    private static int[][] calculateTypeB(int rows) {
        int[][]matrix =new int[rows][rows];
        int counter =1;

        for(int row=0;row<rows;row++)
        {
            if(row%2==0)
            {
                for(int col=0;col<rows;col++)
                {
                    matrix[col][row] = counter++;
                }
            }
            else
            {
                for(int col=rows-1;col>=0;col--)
                {
                    matrix[col][row] = counter++;
                }
            }
        }
        return matrix;
    }

    private static int[][] calculateTypeA(int rows) {
        int[][]matrix =new int[rows][rows];
        int counter =1;

        for(int row=0;row<rows;row++)
        {
            for(int col=0;col<rows;col++)
            {
                matrix[col][row]=counter++;
            }
        }
        return matrix;
    }

    private static void printMatrix(int rows, int[][] matrix) {
        for(int row =0;row<rows;row++)
        {
            for(int column=0;column<rows;column++)
            {

                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }



}
