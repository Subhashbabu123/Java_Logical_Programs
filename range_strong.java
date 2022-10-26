//write a program to print all strong numbers between given interval
import java.util.Scanner;
class range_strong
  {
    public static void main(String args[])
    {
      int num1,num2,i;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter starting number: ");
      num1=sc.nextInt();
      System.out.print("enter ending number: ");
      num2=sc.nextInt();
      System.out.println("Armstrong numbers are");

      for(i=num1;i<=num2;i++)
        {
          int n=i;
          int sum=0;
          while(n!=0)
            {
              int fact=1;
              int d=n%10;
              n=n/10;
              for(int j=1;j<=d;j++)
                {
                  fact=fact*j;
                }
              sum=sum+fact;
            }
          if(sum==i)
          {
            System.out.print(sum+" ");
          }
        }
    }
  }