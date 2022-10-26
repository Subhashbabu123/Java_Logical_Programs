//write a program to print all armstrong numbers between given interval using functions
import java.util.Scanner;
class range_armstrong
  {
    public static void main(String args[])
    {
      int num1,num2,number,d,sum=0,i;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter starting number: ");
      num1=sc.nextInt();
      System.out.print("enter ending number: ");
      num2=sc.nextInt();
      System.out.println("Armstrong numbers are");

      for(i=num1;i<=num2;i++)
        {
          number=i;
          while(number!=0)
            {
              d=number%10;
              sum=sum+(d*d*d);
              number=number/10;
            }
          if(sum==i)
            System.out.print(sum+" ");
          sum=0;
        }
    }
  }