package advancedJava.linear2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class matrixShuf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] matrixSize=scanner.nextLine().split("\\s+");


        int rows=Integer.parseInt(matrixSize[0]);
        int cols=Integer.parseInt(matrixSize[1]);

        String[][]matrix=new String[rows][cols];

        for(int i=0;i<rows;i++)
        {
            String[] currentLine=scanner.nextLine().split("\\s+");
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=currentLine[j];
            }
        }

      while(true){
        String[] line =scanner.nextLine().split("\\s+");
        if(line[0].equals("END"))


        {
            break;
        }
    if(line[0].equals("swap")&&line.length==5)
    {
            int firtsNum=Integer.parseInt(line[1]);
            int secondNum=Integer.parseInt(line[2]);
            int thirdNum=Integer.parseInt(line[3]);
            int fourthNum=Integer.parseInt(line[4]);


            if(firtsNum>rows||thirdNum>rows||secondNum>cols||fourthNum>cols) {
                System.out.println("Invalid input!");
            }
            else {
                String temp = "";
                temp = matrix[firtsNum][secondNum];
                matrix[firtsNum][secondNum] = matrix[thirdNum][fourthNum];
                matrix[thirdNum][fourthNum] = temp;

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            }
                else
                {
                    System.out.println("Invalid input!");
                }
            }
        }
    }

