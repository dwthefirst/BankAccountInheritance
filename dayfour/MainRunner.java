package weekfour.dayfour;

public class MainRunner {
    public static void main(String[] args) {
        Bank<BankAccount> myBank = new Bank<>();

        CheckingAccount pncChecking = new CheckingAccount(42,5000.00,100.00);
        SavingsAccount pncSavings = new SavingsAccount(43,3500.00,3.5);
        CreditCard chase = new CreditCard(12,4000.00,"4485-3322-8347-9987");
        CreditCard amex = new CreditCard(12,4000.00,"4335-3322-1011-0000");

        myBank.addAccount(pncChecking);
        myBank.addAccount(pncSavings);
        myBank.addAccount(chase);
        myBank.addAccount(amex);

        System.out.println(CreditCard.tierCheck(amex.getCcNumber()));

        System.out.println(myBank.getTotalBalance());
        pncSavings.withdraw(300);
        pncChecking.withdraw(200);


        System.out.println(myBank.getTotalBalance());

        BankAccount account1 = new CheckingAccount(1, 1000, 2000);
        account1.contactBankManager();

        CreditCard account2 = new CreditCard(2, 2000, "111-222-333");
        //System.out.println("credit card account: ");
        account2.contactBankManager();

        BankAccount savings = new SavingsAccount(3, 3000, 2);
        savings.contactBankManager();
    }
}
