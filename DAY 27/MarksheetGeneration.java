
import java.util.Scanner;

public class MarksheetGeneration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Marks of Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3;

        System.out.println("\nMarksheet");
        System.out.println("Roll No : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage);

        if (percentage >= 90)
            System.out.println("Grade : A+");
        else if (percentage >= 75)
            System.out.println("Grade : A");
        else if (percentage >= 60)
            System.out.println("Grade : B");
        else if (percentage >= 40)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");

       
    }
}
