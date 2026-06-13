


import java.util.Scanner;
public class largestandsmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.print(" enter the array  size: ");
         int n = sc.nextInt();
           
         int []arr = new int[n];

         System.out.println(" enter the array element : ");
         for( int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
        
        int max = arr[0];
         for( int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                 max = arr[i];

            }
         }
          int min = arr[0];
         for( int i = 0;i<arr.length;i++){
            if (arr[i]<min){
               min = arr[i];

            }
         }
          

          
         System.out.print(" the maxiimum value is : ");
         System.out.println(max);

         System.out.print(" the minimum value is : ");
         System.out.println(min);

    }
    
}
