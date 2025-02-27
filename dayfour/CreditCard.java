package weekfour.dayfour;

public class CreditCard extends BankAccount {

    private String ccNumber;


    public CreditCard(int accountNumber, double balance, String ccNumber) {
        super(accountNumber, balance);
        this.ccNumber = ccNumber;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance  >= amount){
            balance -= amount;
            System.out.println("Withdrawl succesful: current balance = " + balance);
        }else{
            System.out.println("Withdraw failed: not enough funds");
        }
    }


    public static String tierCheck(String creditCardNumber){
        String strippedCCNumber = creditCardNumber.replaceAll("[^\\d]","");
        long ccNumberLong = Long.parseLong(strippedCCNumber);
        int sum = 0;
        while(ccNumberLong > 0){
            long lastDigit = ccNumberLong % 10;
            sum += lastDigit;
            ccNumberLong = ccNumberLong / 10;
        }
        if(sum >= 80){
            return "Platinum";
        }else if(sum >= 60){
            return "Gold";
        }else if(sum >= 40){
            return "Silver";
        }else {
            return "Bronze";
        }
    }

    @Override
    public void contactBankManager() {
        //super.contactBankManager();
        System.out.println("To: Bank Manager: " + ContactBankStaff.bankManager + " This is a: " + this.getClass().getSimpleName());
    }
}
