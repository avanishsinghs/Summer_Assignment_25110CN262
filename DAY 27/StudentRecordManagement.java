
import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] roll = new int[n];
        String[] name = new String[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Roll No: ");
            roll[i] = sc.nextInt();

            System.out.print("Enter Name: ");
            name[i] = sc.next();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\nStudent Records");

        for (int i = 0; i < n; i++) {
            System.out.println("Roll No : " + roll[i]);
            System.out.println("Name : " + name[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println();
        }

       
    }
}