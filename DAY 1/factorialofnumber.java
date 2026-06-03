import java.util.Scanner;
public class factorialofnumber {

    public static void main(String [] args ){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int n = sc.nextInt();
            long fact = 1;
            
            
            for (int i=1;i<=n;i++){
                fact =fact*i;
            }
            
            System.out.println(fact);
        }
    }
}
