import java.util.Scanner;

public class UNIONARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array a: ");
        int n = sc.nextInt();

        System.out.print("Enter the size of array b: ");
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        System.out.print("Enter the elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the elements of array b: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n + m];
        int k = 0;

       
        for (int i = 0; i < n; i++) {   // Add unique elements from array a
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (a[i] == c[j]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                c[k] = a[i];
                k++;
            }
        }

        
        for (int i = 0; i < m; i++) {  // Add unique elements from array b
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (b[i] == c[j]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                c[k] = b[i];
                k++;
            }
        }

        System.out.print("Union Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
    }
}