import java.util.Scanner;
class jump_odd
  {
    public static void main(String args[])
    {
      int n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      for(int i=0;i<=n;i++)
        {
          if(i%2==0)
           continue;
          sum=sum+i;
        }
      System.out.println("the sum of odd numbers are:"+sum);
    }
  }