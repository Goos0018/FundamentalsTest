package be.vdab.moneyInDaBank.accounts;

public class CurrentAccount extends Account {

    private double currentMoney;

    /**
     * No way to transfer money from current to savings?
     */


    public CurrentAccount(double startMoney) {
        this.currentMoney = startMoney;
    }

    public void withdrawMoney(double amount){
        this.currentMoney -= amount;
    }


    /**
     * =+ is not the same as +=.
     * =+500 will assign +500 to the variable to the left, =-500 will assign -500 the the left.
     * += will add 500 to the total to the left.
     */
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
