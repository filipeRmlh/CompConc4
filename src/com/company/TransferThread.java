package com.company;

import static java.lang.Thread.interrupted;

public class TransferThread extends Thread {
    private Bank myBank;
    private int account,maxValue;

    TransferThread(Bank bank,int account, int maxValue){
        this.myBank = bank;
        this.account = account;
        this.maxValue = maxValue;
    }

    public void run(){
        while (!interrupted()){
            System.out.println("FOI");
            int accountTo = (int) (Math.random()*this.myBank.size());
            int amount = (int) (Math.random()*this.maxValue);
            this.myBank.transfer(this.account,accountTo,amount);
        }
    }


}
