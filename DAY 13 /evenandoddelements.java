

import java.util.Scanner;
public class evenandoddelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.print(" enter the array  size: ");
         int n = sc.nextInt();
           
         int []arr = new int[n];

         System.out.println(" enter the array element : ");
         for( int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
         }


           int[] arra = arr;
            int even = 0;

            System.out.print("the even elements are " );
         for( int i = 0;i<arr.length;i++){
            if( arra[i]%2==0){
             
            System.out.print(arra[i]+" ");
            even++;
            
         }
         

        }
        System.out.println(" the even elements is "+even);

        int odd = 0;
         System.out.print("the odd elements are " );
          for(  int j = 0;j<arr.length;j++){
            if( arr[j]%2!=0){
             
            System.out.print(arr[j]+" ");
            odd++;
            
         }
    


    }
    System.out.println("the odd elements are "+odd);
}
}