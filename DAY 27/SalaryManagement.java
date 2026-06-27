
import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double gross = basic + hra + da;

        System.out.println("\nSalary Slip");
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary : " + basic);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary : " + gross);

       
    }
}