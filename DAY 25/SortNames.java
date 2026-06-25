import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            name[i] = sc.nextLine();
        }

        String temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
    }
}