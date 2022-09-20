import java.util.Scanner;
class fact
{
   int n,fact;  
   int fact(int x)
  {
     n=x;
     fact=1;
     for(int i=1;i<=n;i++)
       {
         fact=fact*i;
       }
     return fact;
  }
}
class OOPS_fact
  {
     public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value");
       int m=sc.nextInt();
       fact n=new fact();
       int z=n.fact(m);
       System.out.println("The factorial is:"+z);
    }
}