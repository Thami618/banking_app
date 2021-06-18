package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	BankAcount obj = new BankAcount("Thamsanqa", "BX9858");
	obj.ShowMenu();
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
        if(amount > 0){
            balance = balance + amount;
            PreviousTrans = amount;
        }

    }
    public int withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            PreviousTrans = -amount;
        }
        return withdraw(amount);
    }

    public void getPreviousTrans(int PreviousTrans) {
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
        //return getPreviousTrans(PreviousTrans);
    }
    public void ShowMenu(){
        char option = 'A';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + CustName);
        System.out.println("Your ID " + CustID);
        System.out.println("\n");
        System.out.println("A. Check your Balance");
        System.out.println("B. Do you want to deposit cash?");
        System.out.println("C. Do you want to withdraw cash?");
        System.out.println("D. Do you want to check previous transaction?");
        System.out.println("E. Exit");

        do {
            System.out.println("*****************************************");
            System.out.println("What do you wish to do " + CustName);
            System.out.println("*****************************************");
            option = scanner.next().charAt(0);
            //System.out.println("/n");

            switch (option){
                case 'A' :
                    System.out.println("*****************************************");
                    System.out.println("Balance: " + balance);
                    System.out.println("*****************************************");
                    //System.out.println("/n");
                    break;
                case 'B' :
                    System.out.println("*****************************************");
                    System.out.println("Enter amount you want to deposit");
                    int amount = scanner.nextInt();
                    System.out.println("*****************************************");
                    //System.out.println("/n");
                    break;
                case 'C' :
                    System.out.println("*****************************************");
                    System.out.println("Enter withdrawal amount");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("*****************************************");
                    //System.out.println("/n");
                    break;
                case 'D' :
                    System.out.println("*****************************************");
                    getPreviousTrans(PreviousTrans);
                    System.out.println("*****************************************");
                    System.out.println("/n");
                    break;
                case 'E' :
                    System.out.println("*****************************************");
                    break;

                default:
                    System.out.println("Invalid option, try again");
                    break;

            }
        } while (option != 'E');
        System.out.println("Thank for using our service");
    }
}
