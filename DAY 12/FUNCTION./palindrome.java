

import java.util.Scanner;
public class palindrome {
    public static void palindrome(int n) {
int temp ;
temp =n;
int rev =0;
while(temp!=0){
  int d = temp%10;
  rev =(rev*10)+d;
  temp = temp/10;
}
if (n == rev ){
    System.out.println("palindrome ");
}

else {
    System.out.println("not palindrome");
}
    
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
   System.out.print("enter n =  ");
   int n = sc.nextInt();

  

palindrome(n);



    }
    
} 
