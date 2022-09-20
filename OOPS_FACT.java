import java.util.Scanner;
class factorial
{
   int n,fact;  
   void fact(int x)
  {
     n=x;
     fact=1;
     for(int i=1;i<=n;i++)
       {
         fact=fact*i;
       }
     System.out.println("The factorial is:"+fact);
  }
}
class OOPS_FACT
  {
     public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value");
       int m=sc.nextInt();
       factorial n=new factorial();
       n.fact(m);
    }
}