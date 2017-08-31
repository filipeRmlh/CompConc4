package com.company;

public class Bank {
    private int[] Accounts;
    private long Transactions;

    public Bank(int NumberOfAccounts,int InitialBalance){
        this.Accounts = new int[NumberOfAccounts];
        for (int i=0;i<NumberOfAccounts;i++){
            this.Accounts[i]=InitialBalance;
        }
        this.Transactions=0;
    }

    public void transfer(int from, int to, int amount){
        if(this.Accounts[from] >= amount){
            this.Accounts[from] -= amount;
            this.Accounts[to] += amount;
        }else{
            System.err.println("Saldo insuficiente para realizar transação\n");
        }

    }
    public int size(){
        return this.Accounts.length;
    }

}
