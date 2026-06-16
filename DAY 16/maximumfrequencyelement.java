

import java.util.Scanner;
public class  maximumfrequencyelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 System.out.print("enter the array length: ");
      int m = sc.nextInt();

      int [] arr =new int[m];

      System.out.print(" enter the array element : ");
      for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
      }

      int maxFreq = 0;
        int maxElement = arr[0];

      for (int i = 0 ;i<arr.length;i++){

        int frequncy = 0;

        for (int j = 0 ;j<arr.length;j++){

            if (arr[i]==arr[j]){

            frequncy ++;     

         }
        }
        if ( frequncy > maxFreq){ 
            maxFreq =frequncy;
            maxElement =arr[i];

}
        }
        System.out.println("Maximum Frequency Element = " + maxElement);
        System.out.println("Frequency = " + maxFreq);
        
      }
     

     }
     
   




    

