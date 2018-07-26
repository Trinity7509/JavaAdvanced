package advancedJava.OOPBasicStaticId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {

    private static HashMap<Integer,BankAccount> accounts=new HashMap<>();
    private static int id=0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            String input=reader.readLine();

            if("End".equalsIgnoreCase(input))
            {
                break;
            }

            String[] cmdArgs=input.split("\\s+");
            String cmd=cmdArgs[0];

            switch (cmd)
            {
                case"Create":
                    id++;
                    accounts.put(id,new BankAccount());
                  accounts.get(id).setId(id);
                    System.out.printf("Account %s created%n",accounts.get(id).toString());
                    break;
                case"Deposit":
                    int targetId=Integer.parseInt(cmdArgs[1]);
                    if(accounts.containsKey(targetId))
                    {
                        accounts.get(targetId).deposit(Double.parseDouble(cmdArgs[2]));
                        DecimalFormat df=new DecimalFormat("#.##");
                        System.out.printf("Deposited %s to %s%n",df.format(Double.valueOf(cmdArgs[2])),accounts.get(targetId).toString());
                    }
                    else
                    {
                        System.out.println("Account does not exist");
                    }
                    break;
                case"SetInterest":
                    BankAccount.setInterest(Double.parseDouble(cmdArgs[1]));
                    break;
                case"GetInterest":
                    targetId=Integer.parseInt(cmdArgs[1]);
                    if(accounts.containsKey(targetId))
                    {
                        DecimalFormat df=new DecimalFormat("0.00");
                        System.out.println(df.format(accounts.get(targetId).getInterest(Integer.valueOf(cmdArgs[2]))));

                    }
                    else
                    {
                        System.out.println("Account does not exist");
                    }

                    break;
            }
        }
    }
}
