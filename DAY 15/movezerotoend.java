

import java.util.Scanner;
public class   movezerotoend {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.print(" enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int [n];

        System.out.print(" enter the array elements : ");
       for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       }
  int j =0;
       for(int i = 0;i<arr.length;i++){
       if(arr[i]!=0){
      int temp =arr[i];
     arr[i] = arr[j]; 
     arr[j] = temp;
       j++;
       }
       }
      
     
System.out.println("after moving zero to end  : ");
for(int ele : arr){
    System.out.print(ele+" ");
}

    } 
}