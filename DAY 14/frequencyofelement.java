

import java.util.Scanner;
public class frequencyofelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.print(" enter the array element :  ");
        for ( int i = 0 ;i < arr.length;i++){
            arr[i] = sc.nextInt();

        }

        System.out.print("enter the targeted element: ");
        int target = sc.nextInt();

    int frequency = 0;
for ( int i = 0 ;i < arr.length;i++){
    if (arr[i]==target) {      
    frequency++;
    }
        }
 System.out.println("the freqency of "+target+" is :"+frequency);

    }
    
    
}

