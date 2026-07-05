package com.atm;

import java.util.Scanner;

public class ATMService {
    Account account =new Account();
    public void startAtm(){
        int choice=0;
        do {
            displayMenu();
            choice = getChoice();
            switch (choice) {
                case 1:
                    depositMoney();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Wrong choice");

            }
        }while(choice!=4);
    }
    public void displayMenu()
    {
        System.out.println("welcome to ATM service");
        System.out.println("1.deposit money");
        System.out.println("2. withraw money");
        System.out.println("3. check balance");
        System.out.println("4. exit");


    }
    public int  getChoice()
    {
        Scanner sc=new Scanner(System.in);
        return  sc.nextInt();
    }
    public void depositMoney()
    {
        System.out.println("Enter amount to deposit");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        account.balance= account.balance+amount;
        System.out.println("deposited "+amount);
        System.out.println("current balance is "+account.balance);
    }
    public void withdrawMoney()
    {
        System.out.println("Enter amount to withdraw");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if(account.balance>=amount) {
            account.balance = account.balance - amount;
            System.out.println("current balance is " + account.balance);
        }
        else {
            System.out.println("Insufficiant balance");
        }
    }
    public void checkBalance()
    {
        System.out.println("your balance is "+account.balance);
    }
    public void exit()
    {
        System.exit(0);
    }


}
