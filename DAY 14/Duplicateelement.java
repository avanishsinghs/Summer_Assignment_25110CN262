


import java.util.Scanner;
public class Duplicateelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.print(" enter the array element :  ");
        for ( int i = 0 ;i < arr.length;i++){
            arr[i] = sc.nextInt();

        }
 System.out.print("duplicates elements are : ");
for ( int i = 0 ;i < arr.length;i++){
    for (int j =i+1;j<arr.length;j++){
    if (arr[i]==arr[j]) {
        System.out.print(arr[i]+" ");
        break;
    }
    }
        }

}
}

