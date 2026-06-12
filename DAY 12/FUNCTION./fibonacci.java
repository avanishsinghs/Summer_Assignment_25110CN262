


import java.util.Scanner;
public class fibonacci  {
    public static void fibo(int n) {
int a=0,b=1,c;
for (int i =1;i<=n;i++){
System.out.print(a+" ");
 c = a+b;
    a =b;
    b=c;
}

    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
   System.out.print("enter n =  ");
   int n = sc.nextInt();

  

fibo(n);



    }
    
} 

