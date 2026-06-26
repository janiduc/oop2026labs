package Lab03.Q1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number : ");
        String AccountNo = sc.nextLine();
        System.out.print("Enter Account Holder Name : ");
        String AccountHolder = sc.nextLine();
        System.out.print("Enter Initial Deposit : ");
        double InitialDeposit = sc.nextDouble();
        SavingsAccount account1 = new SavingsAccount(InitialDeposit);

        account1.setAccountNumber(AccountNo);
        account1.setAccountHolderName(AccountHolder);

        account1.displayAccountDetails();

        System.out.print("\nEnter Deposit Amount : ");
        int DeposiAmount = sc.nextInt();
        System.out.print("Depositing...");
        account1.deposit(DeposiAmount);

        System.out.print("\nEnter Withdrawal Amount : ");
        int WithdrawalAmount = sc.nextInt();
        System.out.print("Withdrawing...");
        account1.withdraw(WithdrawalAmount);

        System.out.println("\nAttempting to withdraw 10000...");
        account1.withdraw(100000);

        System.out.println("\nFinal Account Details:");
        account1.displayAccountDetails();
    }
}
