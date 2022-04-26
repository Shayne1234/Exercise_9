package com.company;

public class Account {

    String owner;
    int balance, accountNumber;

    public Account(String owner, int balance, int accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwnerElton() {
        return owner;
    }

    public void setOwnerElton(String owner) {
        this.owner = owner;
    }

    public int getBalanceElton() {

        return balance;
    }

    public int setBalance(int balance) {
        return this.balance = balance;
    }

    public int getAccountNumberforElton() {
        return accountNumber;
    }

    public void setAccountNumberforElton(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String methodPrintInfo(){
        String result  = "Owner:" + getOwnerElton();
        result += "\nBalance: " + getBalanceElton();
        result += "\nAccountNumber: " + getAccountNumberforElton();
        return result;
    }

    public double methodTransferElton(double amount){
        return balance -= amount;
    }

    public void methodTransferElton(int i) {
    }
}

