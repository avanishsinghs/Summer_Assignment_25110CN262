import java.util.Scanner;

public class SortWordsByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] word = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            word[i] = sc.nextLine();
        }

        String temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (word[i].length() > word[j].length()) {
                    temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");
        for (int i = 0; i < n; i++) {
            System.out.println(word[i]);
        }
    }
}
