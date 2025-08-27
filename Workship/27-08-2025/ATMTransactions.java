import java.util.*;
public class ATMTransactions {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of transactions:");
        int n = sc.nextInt();
        int transactions [] = new int[n];
        System.out.println("Enter the transactions (positive for deposit, negative for withdrawal):");
        for(int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }
        int balance = 0;
        for (int i=0; i<transactions.length; i++) {
            balance += transactions[i];
            if (balance < 0) {
                System.out.println("Overfraft");
            }
        }
        System.out.println("Final balance: " + balance);
    }
}