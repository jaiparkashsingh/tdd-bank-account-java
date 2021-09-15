package org.xpdojo.bank;

public class Account {
    public int balance ;
    public int deposit(int amount){
        this.balance += amount;
        return balance;
    }
}
