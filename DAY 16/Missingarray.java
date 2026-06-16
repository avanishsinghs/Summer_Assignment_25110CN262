
import java.util.Scanner;
public class Missingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 System.out.print("enter the array length: ");
      int m = sc.nextInt();


      int [] arr =new int[m];

      System.out.print(" enter the array element : ");
      for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
      }
int n = arr.length+1;
     int sum = n*(n+1)/2;
     
    int  arrsum = 0;
    for (int i = 0 ; i<arr.length;i++){
        arrsum +=arr[i];

    }
    System.out.println("the missing element is "+(sum-arrsum));

    }
    
}
