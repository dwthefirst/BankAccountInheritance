package weekfour.dayfour;

public class CheckingAccount extends BankAccount{

    private double overDraftLimit;

    public CheckingAccount(int accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 &&(balance + overDraftLimit) >= amount){
            balance -= amount;
            System.out.println("Withdrawl succesful: current balance = " + balance);
        }else{
            System.out.println("Withdraw failed: not enough funds");
        }
    }
}
