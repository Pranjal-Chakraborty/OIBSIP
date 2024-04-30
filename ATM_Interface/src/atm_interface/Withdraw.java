package atm_interface;

public class Withdraw extends Bank_account {
    public static void withdraw(int amount) {
        if(balance == 0 || amount > balance){
            System.out.println("Insufficient Account Balance.");
        }
        else{
            balance = (balance - amount);
            System.out.println("Amount Withdrawn Successfully!");
        }
    }
}
