
import java.util.Scanner;

public class INTERSECTIONOFARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array a: ");
        int n = sc.nextInt();

        System.out.print("Enter size of array b: ");
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        System.out.print("Enter elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter elements of array b: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.print("Intersection Array: ");

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print(a[i] + " ");
            }
        }
    }
}