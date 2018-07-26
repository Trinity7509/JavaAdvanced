package advancedJava.OOPBasicStaticId;

public class BankAccount {


    private final static double DEFAULT_INTEREST=0.02;

    private static double rate=DEFAULT_INTEREST;


    private int Id;
    private double balance=0.0;

public void setId(int id)
{
    Id=id;
}

public static void setInterest(double interest)
{
    rate=interest;
}
public void deposit(double amount)
{
    this.balance +=amount;
}
public double getInterest(int years)
{
    return this.balance*rate*years;
}

    public String toString()
{
    return "ID" +this.Id;
}
}


