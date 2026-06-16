
import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the array size = ");
        int n = sc.nextInt();

        int []arr = new int[n];

        System.out.println(" enter the elements ");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
      System.out.print("enter the target element: ");
       int target = sc.nextInt();

boolean found = false;
        
        for(int i =0;i<arr.length;i++){
            for (int j= i+1;j<arr.length;j++){
            if ((arr[i]+arr[j])==target){
                found = true;
            }
           
        }

        }
        if (found==true )System.out.println("target element exists ");
        else System.out.println( "target element does not exists ");


    }
    
}

