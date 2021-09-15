package org.xpdojo.bank;

public class Account {
    public int balance ;
    public int deposit(int amount){
        this.balance += amount;
        return balance;
    }

    public int withdrawal(int amount){
        if(this.balance > amount) {
            this.balance -= amount;
        }
        return balance;
    }

    public int transfer(int accountNumber, int amount){
        if(this.balance > amount) {
            this.balance -= amount;
        }
        return balance;
    }


}
