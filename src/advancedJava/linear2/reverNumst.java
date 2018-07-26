package advancedJava.linear2;



import java.util.ArrayDeque;

import java.util.Scanner;

public class reverNumst {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] tokens =scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack=new ArrayDeque<>();

      for( int i=0;i<tokens.length;i++)
      {

          int num=Integer.parseInt(tokens[i]);
          stack.push(num);
      }

      while(stack.size()>0)
      {
          System.out.print(stack.pop()+" ");
      }


    }
}
