import java.util.Scanner;
class while_strongnumber
  {
  public static void main(String args[])
    {
    int num,number,d=0,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      number=sc.nextInt();
      num=number;
      while(number>0)
        {
          d=number%10;
          int mul=1;
          for(int i=1;i<=d;i++)
            {
              mul=mul*i;
            }
          sum=sum+mul;
          number=number/10;
        }
      if(sum==num)
      System.out.println("given number is Strong Number");
      else
        System.out.println("given number is not a Strong Number");
    }
  }