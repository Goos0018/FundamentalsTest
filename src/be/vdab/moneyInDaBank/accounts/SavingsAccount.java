package be.vdab.moneyInDaBank.accounts;

public class SavingsAccount extends Account {

    private CurrentAccount currentAccount;
    private double savingsMoney;

    public SavingsAccount(CurrentAccount currentAccount, double savingsMoney) {
        this.currentAccount = currentAccount;
        this.savingsMoney = savingsMoney;
    }

    public void transferMoney(Account accountfrom, Account accountTo, double amount) {
        if (accountfrom instanceof CurrentAccount) {
            this.currentAccount.setCurrentMoney(this.currentAccount.getCurrentMoney() - amount);
            this.setSavingsMoney(this.getSavingsMoney() + amount);
        } else {
            this.currentAccount.setCurrentMoney(this.currentAccount.getCurrentMoney() + amount);
            this.setSavingsMoney(this.getSavingsMoney() - amount);
        }
    }

    public void annualIntrest(){
        double thisYearsIntrest = this.savingsMoney * getIntrest();
        this.savingsMoney += this.savingsMoney * getIntrest();
        System.out.println("Your savingsaccount generated " + thisYearsIntrest + " of intrest this year, your total amount of your savingsaccount is now " + this.savingsMoney);
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    public double getSavingsMoney() {
        return savingsMoney;
    }

    public void setSavingsMoney(double savingsMoney) {
        this.savingsMoney = savingsMoney;
    }
}
