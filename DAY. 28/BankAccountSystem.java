
import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000;
        int choice;
        double amount;

        do {
            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextDouble();
                    balance = balance + amount;
                    System.out.println("Amount Deposited Successfully.");
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Amount Withdrawn Successfully.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance = " + balance);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);


    }
}