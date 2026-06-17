
import java.util.Scanner;
public class MERGEARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the size of array a : ");
        int n = sc.nextInt();

        System.out.print("enter the array size of b : ");
        int m = sc.nextInt();

        int [] a = new int [n];

        int [] b = new int [m];

    
        System.out.print("enter the array a elements : ");
        for(int i = 0; i < a.length;i++){
            a[i] = sc.nextInt();
 
        }
        System.out.print("enter the array a elements : ");
        for(int i = 0; i < b.length;i++){
            b[i] = sc.nextInt();
 
        }
         
        int [] c = new int[a.length+b.length];

        int i = 0, j= 0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] =a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        if( i == a.length){
            while(j<b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        else{
            while( i< a.length){
                c[k] = a[i];
                i++;
                k++;

            }
        }

        System.out.print(" after merging the elements are :");
        for(int l =0 ;l<c.length;l++){
            System.out.print(c[l]+" ");
        }

    }
}
