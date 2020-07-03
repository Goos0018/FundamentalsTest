package be.vdab.moneyInDaBank;

import be.vdab.moneyInDaBank.accounts.CurrentAccount;
import be.vdab.moneyInDaBank.accounts.SavingsAccount;

public class HomeBankingApp {
    public static void main(String[] args) {

        //Create person
        Person thomas = new Person("Thomas", 32);

        //Create CurrentAccount
        CurrentAccount zicht = new CurrentAccount(500);

        //create Savingsaccount
        SavingsAccount spaar = new SavingsAccount(zicht, 500);

        //add accounts to person
        thomas.addAccount(zicht);
        thomas.addAccount(spaar);

        // tranfer €100 from savings to current
        spaar.transferMoney(spaar, zicht, 100);

        // print new current
        System.out.println(zicht.getCurrentMoney());

        // anual intrest calculation
        spaar.annualIntrest();
    }
}
