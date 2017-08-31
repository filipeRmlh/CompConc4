package com.company;

public class Main {
    public static int NUMBEROFACCOUNTS;
    public static int INITIALBALANCE;
    public static void main(String[] args) {
        Bank bb = new Bank(Main.NUMBEROFACCOUNTS,Main.INITIALBALANCE);
        TransferThread[] threads = new TransferThread[Main.NUMBEROFACCOUNTS];

        for(int i=0;i<Main.NUMBEROFACCOUNTS;i++){
            threads[i]=new TransferThread(bb,i,2);
            threads[i].start();
        }
    }
}
