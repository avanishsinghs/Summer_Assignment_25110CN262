
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBooks = 5;
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Show Available Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Available Books: " + totalBooks);
                    break;

                case 2:
                    if (totalBooks > 0) {
                        totalBooks--;
                        System.out.println("Book Issued Successfully.");
                    } else {
                        System.out.println("No Books Available.");
                    }
                    break;

                case 3:
                    totalBooks++;
                    System.out.println("Book Returned Successfully.");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        
    }
}