package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
 class BankAcount{
    int balance;
    int PreviousTrans;
    String CustName;
    String CustID;

    //Constractor
    BankAcount(String cname, String cid){
        CustName = cname;
        CustID = cid;
    }

    public void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            PreviousTrans = amount;
        }

    }
    public void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            PreviousTrans = -amount;
        }
    }

    public void getPreviousTrans() {
        if(PreviousTrans > 0)
        {
            System.out.println("Deposited: " + PreviousTrans);
        }
        else if (PreviousTrans < 0){
            System.out.println("Withdrawn: " +Math.abs(PreviousTrans ));
        }
        else {
            System.out.println("No Transaction");
        }
    }
    public void ShowMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
    }
}
