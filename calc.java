import java.util.*;

class calc
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  calc c=new calc();
  
  int n;
  System.out.println("Enter the number:");
  n=sc.nextInt();
  
  c.Factorial(n);
  c.Sum(n);
 }
 
void Factorial(int n)
 {
  calc c1=new calc();
  int fact=1;
  for(int i=1;i<=n;i++)
  {
   fact*=i;
  }
  
  System.out.println("The factorial is:"+fact);
 }
 
 void Sum(int n)
 {
  int s=0,digit;
  
  while(n!=0)
  {
   digit=n%10;
   s+=digit;
   n/=10;
  }
  
  System.out.println("The sum of digits is:"+s);
 }
}