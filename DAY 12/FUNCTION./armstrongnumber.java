

import java.util.Scanner;
public class armstrongnumber {
    public static void  armstr(int n) {
int temp ;
temp =n;

int count =0;

while (temp!=0){
     count++;
 temp=temp/10;
  
    
} 
temp =n;
double sum=0;
while(temp!=0){
   
//   double d = temp%10;
//   double pow =1;
//   for (int i=1;i<=count;i++){
//      pow = pow *d;
//   }
//  d = pow;
int d =temp%10;
double c = Math.pow(d,count);
sum=sum+ c;
  temp = temp/10; 
  
}
if ( sum==n ){
    System.out.println("armstrong number ");
}

else {
    System.out.println("not armstrong ");
}
    
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
   System.out.print("enter n =  ");
   int n = sc.nextInt();

  

armstr(n);



    }
    
} 
