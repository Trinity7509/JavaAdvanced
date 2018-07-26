package OOPbAsicBankAcLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    private static HashMap<Integer,BankAccount> accounts=new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));



        while (true)
        {
            String input=reader.readLine();

            if("End".equalsIgnoreCase(input))
            {
                break;
            }
            String[] cmdArgs=input.split("\\s+");
            String cmd=cmdArgs[0];
            int id=Integer.parseInt(cmdArgs[1]);

            switch (cmd)
            {
                case "Create":

                    Create(id);
                    break;
                case "Deposit":
                    depositMoney(cmdArgs, id);
                    break;
                case "Withdraw":
                    withdrawMoney(cmdArgs, id);
                    break;
                case "Print":
                    printAccount(id);
                    break;
            }



        }



    }

    public static void printAccount(int id) {
        if(accounts.containsKey(id))
        {
            System.out.println(accounts.get(id).toString());
        }
        else
        {
            System.out.println("Account does not exist\n");
        }
    }

    public static void withdrawMoney(String[] cmdArgs, int id) {
        if(accounts.containsKey(id))
        {
            Double withdrawMoney=Double.parseDouble(cmdArgs[2]);
            accounts.get(id);

            Double  moneyInBank=accounts.get(id).getBalance();

            if(withdrawMoney>moneyInBank)
            {
                System.out.println("Insufficient balance");
            }

            else
            {
                accounts.get(id).withdraw(withdrawMoney);
            }

        }
        else
        {
            System.out.println("Account does not exist");
        }
    }

    public static void depositMoney(String[] cmdArgs, int id) {
        if(accounts.containsKey(id))
        {
            Double depositMoney=Double.parseDouble(cmdArgs[2]);

            accounts.get(id).deposit(depositMoney);
        }
        else
        {
            System.out.println("Account does not exist");
        }
    }

    public static void Create(int id) {
        if(accounts.containsKey(id))
        {
            System.out.println("Account already exists");
        }
        else
        {
         BankAccount account=new BankAccount();
         account.setId(id);
         accounts.put(id,account);
        }
    }

}
