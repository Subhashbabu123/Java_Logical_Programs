import java.util.Scanner;
class armstrong
{
   int n,digit=0,sum=0;
   boolean armstrong(int x)
  {
     n=x;
     for(;n>0;)
       {
         digit=n%10;
         sum=sum+(digit*digit*digit);
         n=n/10;
       }
    if(sum==x)
      return true;
    else
      return false;
  }
}
class OOPS_armstrong
  {
     public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value");
       int m=sc.nextInt();
       armstrong n=new armstrong();
       boolean z=n.armstrong(m);
       if(z)
         System.out.println("It is an Armstrong Number");
       else
         System.out.println("It is not an Armstrong Number");
    }
}