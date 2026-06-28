
import java.util.Scanner;

public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[10];
        String[] phone = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n----- CONTACT MENU -----");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Phone Number: ");
                        phone[count] = sc.nextLine();

                        count++;
                        System.out.println("Contact Added Successfully.");
                    } else {
                        System.out.println("Contact List Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Contacts Found.");
                    } else {
                        System.out.println("\nSaved Contacts:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + name[i] + " - " + phone[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

       
    }
}