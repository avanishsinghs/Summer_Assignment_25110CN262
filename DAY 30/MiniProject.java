
import java.util.Scanner;

public class MiniProject {

    static int[] roll = new int[100];
    static String[] name = new String[100];
    static int[] marks = new int[100];

    static int count = 0;

    static void add(Scanner sc) {

        System.out.print("Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        name[count] = sc.nextLine();

        System.out.print("Marks: ");
        marks[count] = sc.nextInt();

        count++;

        System.out.println("Record Added.");
    }

    static void display() {

        if (count == 0) {
            System.out.println("No Records.");
            return;
        }

        System.out.println("\nRoll\tName\tMarks");

        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
        }
    }

    static void search(Scanner sc) {

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("Name : " + name[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }

        System.out.println("Record Not Found.");
    }

    static void totalStudents() {
        System.out.println("Total Students = " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Total Students");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    add(sc);
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    search(sc);
                    break;

                case 4:
                    totalStudents();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}