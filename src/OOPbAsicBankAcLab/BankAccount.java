package OOPbAsicBankAcLab;

public class BankAccount {
    private int id;
    private double balance;

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount)
    {
                    this.balance += amount;
        }

        public void withdraw(double amount)
        {
            this.balance-=amount;
        }

    @Override
    public String toString() {

        return String.format("Account ID%d, balance %.2f",this.id,this.getBalance());
    }
}
