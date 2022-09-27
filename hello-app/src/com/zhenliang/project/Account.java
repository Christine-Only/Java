package com.zhenliang.project;

public class Account {
    private String idNum;
    private String name;
    private double balance;
    private double withdrawalLimit;

    private String password;

    public Account() {
    }

    public Account(String idNum, String name, double balance, double withdrawalLimit, String password) {
        this.idNum = idNum;
        this.name = name;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
        this.password = password;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
