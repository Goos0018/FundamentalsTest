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
