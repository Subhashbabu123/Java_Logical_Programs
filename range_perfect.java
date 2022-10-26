//write a program to print all perfect numbers between given range using functions
import java.util.Scanner;
class range_perfect
  {
    public static void main(String args[])
    {
      int num1,num2,i,j,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter starting number: ");
      num1=sc.nextInt();
      System.out.print("enter ending number: ");
      num2=sc.nextInt();
      System.out.println("Perfect numbers are");
      for(i=num1;i<=num2;i++)
        {
          n=i;
          for(j=1;j<i;j++)
            {
              if(i%j==0)
              {
                sum=sum+j;
              }
            }
          if(sum==n)
            System.out.print(" "+sum);
          sum=0;
        }
    }
  }