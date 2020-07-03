package be.vdab.moneyInDaBank.accounts;

public class Account {
    private final double intrest = 0.05;
    private double totalMoney;

    public double getIntrest() {
        return intrest;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}