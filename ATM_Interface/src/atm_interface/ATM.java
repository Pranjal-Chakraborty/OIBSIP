package atm_interface;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        System.out.println("Enter your account number : ");
        Scanner scan = new Scanner(System.in);
        Bank_account.account_number = scan.nextLong();
        System.out.println("Enter your account transaction pin : ");
        Bank_account.password = scan.nextInt();
        int choice;

        System.out.print("WELCOME TO ATM MACHINE!!\n");
        System.out.println();

        do {
            System.out.println("Choose an option from below!");

            System.out.println("------------------------------------------------------");
            System.out.println("1.CHECK BALANCE");
            System.out.println("2.WITHDRAW MONEY");
            System.out.println("3.DEPOSIT MONEY");
            System.out.println("4.TRANSFER MONEY");
            System.out.println("5.EXIT");
            System.out.println("------------------------------------------------------");

            System.out.print("Enter your Option:");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    Bank_account.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to Withdraw:");
                    int amount = scan.nextInt();
                    Withdraw.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount you want to Deposit:");
                    int money = scan.nextInt();
                    Deposit.deposit(money);
                    System.out.println("Deposited Successfully!");
                    break;
                case 4:
                    System.out.println("Enter the amount you want to transfer:");
                    int transfer_amount= scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the Account number you want to transfer:");
                    long accNo = scan.nextLong();
                    Transfer.transfer(transfer_amount,accNo);
                    break;
                case 5:
                    System.out.println("Thank you!! Have a nice Day!");
                    break;
                default:
                    System.out.println("Please Choose the correct Option!!");
            }

        }while(choice!=5);

        scan.close();
    }
}
