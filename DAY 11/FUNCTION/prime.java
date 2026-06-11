

import java.util.Scanner;
public class prime {
    public static void prime(int n) {
     
        int p =1;
        for (int i = 2;i<=n/2;i++){
            if (n%i==0){
                p = 0;
            
            }
        }
if (p==0){
    System.out.println("composite number");
}
    else if(n==1) { 
        System.out.println("neither prime nor composite");
}
else
    {
        System.out.println( "prime number");

}
    

    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
   System.out.print("enter n =  ");
   int n = sc.nextInt();

   
 prime(n);



    }
} 

