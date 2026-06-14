

import java.util.Scanner;
public class secondlargestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.print(" enter the array element :  ");
        for ( int i = 0 ;i < arr.length;i++){
            arr[i] = sc.nextInt();

        }
 int max = Integer.MIN_VALUE;
for ( int i = 0 ;i < arr.length;i++){
    if (arr[i]>max) {
max =arr[i];
   
    }
        }

        int smax = Integer.MIN_VALUE;
for ( int i = 0 ;i < arr.length;i++){
    if (arr[i]>smax && arr[i]!=max) {
smax =arr[i];
    } 
 

    }
    System.out.println("The second largest element is :  "+smax);
    
}
}
