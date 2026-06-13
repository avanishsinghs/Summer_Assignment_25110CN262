

import java.util.Scanner;
public class sumandaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.print(" enter the array  size: ");
         int n = sc.nextInt();
           
         int []arr = new int[n];

         System.out.println(" enter the array element : ");
         for( int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
        int sum = 0;
         for( int i = 0;i<arr.length;i++){
            sum = sum+ arr[i];
         }
int average = sum/n;
System.out.print("the sum of the element is : ");
System.out.println(sum);

System.out.print(" the average of the element is : ");
System.out.println(average);

    }
    
}
