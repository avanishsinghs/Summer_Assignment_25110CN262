
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int choice, amount;

        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Current Balance = " + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("Money Deposited Successfully.");
            }
            else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                amount = sc.nextInt();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Please collect your cash.");
                } else {
                    System.out.println("Insufficient Balance.");
                }
            }
            else if (choice == 4) {
                System.out.println("Thank You for using ATM.");
            }
            else {
                System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

     
    }
}