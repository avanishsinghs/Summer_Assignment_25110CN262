
import java.util.Scanner;
public class  perfectnumber{
    public static void  perfectnumber(int n) {

int sum=0;
for (int i= 1;i<=n/2;i++){
    if ( n%i==0){
        sum =sum+i;
    }
    }
    if (n==sum){
        System.out.println("perfect number ");
    }
    else{
        System.out.println("not perfect number ");
    }
    
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
   System.out.print("enter n =  ");
   int n = sc.nextInt();

  

perfectnumber(n);
    }
    
} 

