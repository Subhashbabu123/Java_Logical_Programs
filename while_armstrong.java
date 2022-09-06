import java.util.Scanner;
class while_armstrong
  {
  public static void main(String args[])
    {
    int n,d=0,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      while(n>0)
        {
          d=n%10;
          sum=sum+d*d*d;
          n=n/10;
        }
      if(sum==n)
      System.out.println("given number is Armstrong Number");
      else
        System.out.println("given number is not a Armstrong Number");
    }
  }