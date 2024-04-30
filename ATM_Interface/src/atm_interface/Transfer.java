package atm_interface;

public class Transfer extends Bank_account {
    public static void transfer(int amount, long Acc_No){
        if(balance == 0 || amount > balance){
            System.out.println("Insufficient Account Balance");
        }
        else{
            balance = (balance - amount);
            System.out.println("Amount " + amount + " has been transferred successfully and credited to Account No : " + Acc_No);
        }
    }
}
