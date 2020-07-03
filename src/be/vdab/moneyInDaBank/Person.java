package be.vdab.moneyInDaBank;

import be.vdab.moneyInDaBank.accounts.Account;

public class Person {

    private String name;
    private int age;
    private Account[] accounts;

    public Person(String name, int age) {
        if (age >= 18) {
            accounts = new Account[0];
        }
    }

    public void addAccount(Account account) {
        Account[] result = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            result[i] = accounts[i];
        }
        result[result.length - 1] = account;
        accounts = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
