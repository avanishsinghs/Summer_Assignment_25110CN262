

import java.util.Scanner;
public class   Rotatearrayright {
    public static void reverse(int []arr,int i,int j) {
       while (i<j){
    
    int temp =arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;

} 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.print(" enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int [n];

        System.out.print(" enter the array elements : ");
       for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       }
  
      System.out.print(" enter the rotation digits : ");
      int d = sc.nextInt();

      d = d % n;
       reverse(arr,0,n-d-1);
       reverse(arr,n-d,n-1);
       reverse(arr,0,n-1);

     

for(int k = 0;k<arr.length;k++ ){
    System.out.print(arr[k]+" ");
}

    } 
}