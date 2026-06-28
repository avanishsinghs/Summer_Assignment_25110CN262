
import java.util.Scanner;

public class EmployeeManagement {
   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] id = new int[n];
        String[] name = new String[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter ID: ");
            id[i] = sc.nextInt();

            System.out.print("Enter Name: ");
            name[i] = sc.next();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }

        System.out.println("\nEmployee Details");

        for (int i = 0; i < n; i++) {
            System.out.println("ID : " + id[i]);
            System.out.println("Name : " + name[i]);
            System.out.println("Salary : " + salary[i]);
            System.out.println();
        }

       
    }
}