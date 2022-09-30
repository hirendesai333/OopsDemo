/*
Banking Application:

In this console app I am creating login and logout function additionally there will be
all the basics functions such as Show Balance or account info., deposit or withdraw money, and etc...

I want to cover OOPS concepts that I know so far and banking app i thought it will be a good idea to
Put my knowledge.

Username: hp333
Password: 1234
 */

package org.Oops1BankingSystem;

import java.util.Scanner;

public class Main {
    //Scanner class to get input from user
    static Scanner scanner = new Scanner(System.in);
    public static int choice = 0;
    public static String tryStr = "";

    //try again function
    public static void tryAgain(){
        System.out.print("Want to do login again?");
        tryStr = scanner.nextLine();
        if (tryStr.equals("yes"))
            login();
        else if (tryStr.equals("no")){
        }
        else{
        }
    }

    public static User user = new User();

    //login Function
    public static void login(){
        System.out.print("Enter Username:");
        //here we achieved encapsulation
        user.setUserName(scanner.nextLine());

        System.out.print("Enter Password:");
        user.setPassword(scanner.nextLine());

        if(user.getUserName().equals("hp333")) {
            if (user.getPassword().equals("1234")) {
                System.out.println("Logged in...");
                //show menu
                showMenu();
                user.setAccBalance(user.accBalance);
                user.setAccountNum(user.accountNum);
                user.setFirstName(user.firstName);
                user.setLastName(user.lastName);

//                User user1 = new User(user.accBalance, user.firstName, user.lastName, user.accountNum);

            }else
                tryAgain();
        }
        else
            tryAgain();
    }

    //show account information
    public static void showAccountInfo(){
        System.out.println("First Name: "+user.getFirstName());
        System.out.println("Last Name: "+user.getLastName());
        System.out.println("Account Balance: "+user.getAccBalance());
        System.out.println("Account Number : "+user.getAccountNum());

    }

    //showMenu
    public static void showMenu(){
        int deposit,withdraw;

        //show menu
        System.out.println("Menu...");

        System.out.println("\n-------------------");
        System.out.println("W  E  L  C  O  M  E");
        System.out.println("-------------------\n");
        System.out.println("1. Show Balance.");
        System.out.println("2. Deposit.");
        System.out.println("3. Withdraw.");
        System.out.println("4. User information.");
        System.out.println("5. Log out.");
        System.out.print("\nEnter your choice : ");

        choice = scanner.nextInt();
        //Switch case for the menu choice
        switch (choice){
            case 1:
                System.out.println("$"+user.getAccBalance());
                showMenu();
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                deposit = scanner.nextInt();
                user.accBalance += deposit;
                user.setAccBalance(user.accBalance);
                showMenu();
                break;
            case 3:
                System.out.print("Enter withdraw amount: ");
                withdraw = scanner.nextInt();
                user.accBalance -= withdraw;
                user.setAccBalance(user.accBalance);
                showMenu();
                break;
            case 4:
                showAccountInfo();
                showMenu();
                break;
            case 5:
                break;

            default:
                break;
        }
    }

    //main method
    public static void main(String[] args) {
        //login
        login();
    }
}