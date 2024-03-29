package weekfour.dayfour;

public abstract class BankAccount implements ContactBankStaff{

    private int accountNumber;

    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void displayAccountInfo(){
        System.out.println("Account number " + accountNumber + "Balace" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void contactBankManager() {
        System.out.println("To: Bank Manager: " + ContactBankStaff.bankManager + " Account: " + this.getClass().getSimpleName());
    }
}
