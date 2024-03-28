package weekfour.dayfour;

import java.util.ArrayList;
import java.util.List;

public class Bank <T extends BankAccount>{


    private List<T> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(T account) {
        accounts.add(account);
    }


    public double getTotalBalance(){
        double total = 0;
        for(T account: accounts){
            total += account.balance;
        }
        return total;
    }


}
