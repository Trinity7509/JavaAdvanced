package advancedJava.linear2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class basicQueOper {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String[] tokens=scanner.nextLine().split("\\s+");

        int elAd=Integer.parseInt(tokens[0]);
        int elRem=Integer.parseInt(tokens[1]);
        int num=Integer.parseInt(tokens[2]);

        String[] numbers=scanner.nextLine().split("\\s+");



        ArrayDeque<Integer> queue=new ArrayDeque<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<elAd;i++)
        {
         queue.offer(Integer.valueOf(numbers[i]));
        }
        for(int i=0;i<elRem;i++)
        {
            queue.poll();
        }
if(queue.contains(num))
{
    System.out.println("true");
}
else if(queue.size()==0)
{
    System.out.println("0");
}
else
{
    for (Integer element:queue
         ) {
        if(element<min)
        {
            min=element;
        }

    }
    System.out.printf("%d",min);
}
    }
}
