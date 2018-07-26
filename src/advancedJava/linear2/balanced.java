package advancedJava.linear2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class balanced {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        char[] tokens=scanner.nextLine().toCharArray();
        Deque<Character> queue=new ArrayDeque<>();
        boolean isBalanced=true;



        if(tokens.length%2!=0)
        {
            System.out.println("NO");
        }
        else if(tokens.length%2==0)
        {
            for(int i=0;i<tokens.length;i++)
            {
          if(tokens[i]=='{'||tokens[i]=='('||tokens[i]=='[')
            {
           queue.push(tokens[i]);
            }
            else
          {
              char currentChar=queue.pop();

              if(tokens[i]=='}')
              {
                  tokens[i]='{';
              }

              if (tokens[i]==')')
              {
                  tokens[i]='(';

              }
              if(tokens[i]==']')
              {
                  tokens[i]='[';
              }
              if(tokens[i]!=currentChar)
              {
                  System.out.println("NO");
                  isBalanced=false;
                  break;
              }
          }
            }
            if(isBalanced)
            {
                System.out.println("YES");
            }
        }
    }
}
