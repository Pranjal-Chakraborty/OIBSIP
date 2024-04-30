package atm_interface;

public class Bank_account {
    static long account_number;
    static int password;
    static int balance;
    public static void checkBalance() {
        System.out.println("Remaining Balance in your account is : " + balance);
    }
}
