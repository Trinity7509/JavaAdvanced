package advancedJava.linear2;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class basicStackOp {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String[] numbers=scanner.nextLine().split("\\s+");

        int pushEl=Integer.parseInt(numbers[0]);
        int popEl=Integer.parseInt(numbers[1]);
        int compEl=Integer.parseInt(numbers[2]);


        String[]tokens=scanner.nextLine().split("\\s++");

       Deque<Integer> stack=new ArrayDeque<>();

        int min = Integer.MAX_VALUE;

        //Collections.addAll(stack);

        //while(stack.size()>pushEl)


       for(int i=0;i<pushEl;i++)
        {

        stack.push(Integer.valueOf(tokens[i]));

        }

        for(int i=0;i<popEl;i++)
        {
            stack.pop();
        }

        if(stack.contains(compEl))
        {
            System.out.println("true");
        }

        else if(stack.size()==0)
        {
            System.out.println("0");
        }
        else
        {
            for(Integer integer:stack) {



                if (integer<min)
                {
                    min=integer;
                }

            }
            System.out.printf("%d",min);
        }
    }
}
