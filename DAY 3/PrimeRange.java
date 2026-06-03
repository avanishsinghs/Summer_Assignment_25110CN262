import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int n = start; n <= end; n++) {
            int count = 0;

            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println(n);
            }
        }
    }
}