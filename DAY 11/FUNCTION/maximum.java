

import java.util.Scanner;
public class maximum {
    public static int max(int a ,int b) {

        return Math.max(a,b) ;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
   System.out.print("enter a =  ");
   int a = sc.nextInt();

   System.out.print("enter b = ");
   int b = sc.nextInt();

int max = max(a,b);

System.out.print("maximum number = "+max);

    }
    
} 

