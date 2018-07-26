package advancedJava.setsAndmaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class gameWar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer= getPlayerNumber(scanner);
        LinkedHashSet<Integer> secondPlayer= getPlayerNumber(scanner);

        for(int i=0;i<50;i++)
        {
            if(firstPlayer.isEmpty()||secondPlayer.isEmpty())
            {
                break;
            }
            int firstNum=firstPlayer.iterator().next();
            firstPlayer.remove(firstNum);

            int secondNum=secondPlayer.iterator().next();
            secondPlayer.remove(secondNum);

            if(firstNum>secondNum)
            {
                firstPlayer.add(firstNum);
                firstPlayer.add(secondNum);
            }

            else if(secondNum>firstNum)
            {
                secondPlayer.add(firstNum);
                secondPlayer.add(secondNum);
            }
            else
            {
                continue;
            }

        }
        if(firstPlayer.size()>secondPlayer.size())
        {
            System.out.println("First player win!");
        }
        else if(firstPlayer.size()<secondPlayer.size())
        {
            System.out.println("Second player win!");
        }
        else
        {
            System.out.println("Draw!");
        }

    }

    private static LinkedHashSet<Integer> getPlayerNumber(Scanner scanner) {
        String[] cards=scanner.nextLine().split(" ");

        LinkedHashSet<Integer> players=new LinkedHashSet<>();

        for (String card: cards)
        {
            players.add(Integer.parseInt(card));
        }
        return players;
    }
}
