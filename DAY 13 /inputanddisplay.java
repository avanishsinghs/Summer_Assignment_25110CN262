
import java.util.Scanner;
public class inputanddisplay{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.print(" enter the array  size: ");
         int n = sc.nextInt();
           
         int []arr = new int[n];

         System.out.println(" enter the array element : ");
         for( int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
         System.out.println(" the output is : ");
         for( int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
         }
    }
    
}
