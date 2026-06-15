
import java.util.Scanner;
public class  Reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.print(" enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int [n];

        System.out.print(" enter the array elements : ");
       for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       }
  
       System.out.print(" the reverse of an array : ");

     int i = 0;
     int j = n-1;
while (i<j){
    
    int temp =arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;

}
for(int k = 0;k<arr.length;k++ ){
    System.out.print(arr[k]+" ");
}

    } 
}