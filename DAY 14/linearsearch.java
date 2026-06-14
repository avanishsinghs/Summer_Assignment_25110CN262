
import java.util.Scanner;
public class linearsearch {
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
int index =-1;
       boolean found = false;
for ( int i = 0 ;i < arr.length;i++){
    if (arr[i]==target) {      
    found = true;
     index = i;
     break;
    }
        }

        if (found ==true) System.out.println("the target element found at index "+index);
else System.out.println("target element not found");
    }
    
    
}
