package advancedJava.linear2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String[] tokens=scanner.nextLine().split(";");

        String[] robots=new String[tokens.length];
        int[] prosecTime=new int[tokens.length];
        int[] robotCounter=new int[tokens.length];

        for(int i=0;i<tokens.length;i++)
        {
            String[] robotsToken=tokens[i].split("-");
            robots[i]=robotsToken[0];
            prosecTime[i]=Integer.parseInt(robotsToken[1]);

        }

        String[] timeTokens=scanner.nextLine().split(":");

        long hour=Integer.parseInt(timeTokens[0])*60*60;
        long min=Integer.parseInt(timeTokens[1])*60;
        long sec=Integer.parseInt(timeTokens[2]);

        long time =hour+min+sec;


        Deque<String> queue=new ArrayDeque<>();



            String command="";



            while(!"End".equals(command=scanner.nextLine()))
            {
                queue.offer(command);
            }
            while(!queue.isEmpty())
            {
                time++;

                for(int i=0;i<robots.length;i++)
                {
                    if(robotCounter[i]>0)
                    {
                        robotCounter[i]--;
                    }

                }
                String currentProduct=queue.poll();
                boolean isProductTaken=false;

                for(int i=0;i<robots.length;i++)
                {
                    if(robotCounter[i]==0)
                    {
                        robotCounter[i]=prosecTime[i];
                        isProductTaken=true;

                        System.out.printf("%s - %s [%s]%n",robots[i],currentProduct,convertSeconds(time));
                        break;
             }
                }
             if(!isProductTaken)
            {
               queue.offer(currentProduct) ;
            }

            }






            }


    private static String convertSeconds(long time) {
        long hours=(time/(60*60))%24;
        long mins=(time/60)%60;
        long secs=time%60;

        return String.format("%02d:%02d:%02d",hours,mins,secs);
    }

}

