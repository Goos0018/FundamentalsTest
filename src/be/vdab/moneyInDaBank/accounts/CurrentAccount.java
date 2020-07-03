package be.vdab.moneyInDaBank.accounts;

public class CurrentAccount extends Account {

    private double currentMoney;


    public CurrentAccount(double startMoney) {
        this.currentMoney = startMoney;
    }

    public void withdrawMoney(double amount){
        this.currentMoney -= amount;
    }

    public void depositMoney(double amount){
        this.currentMoney =+ amount;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(double currentMoney) {
        this.currentMoney = currentMoney;
    }
}
