//write a program to print all prime numbers between given interval using functions
import java.util.*;
class range_prime
  {
    static boolean checkPrimeNumber(int num)
    {
      boolean visited=true;
      for(int i=2;i<=num/2;++i)
        {
          if(num%i==0)
          {
            visited=false;
            break;
          }
        }
      return visited;
    }
    public static void main(String args[])
    {
      int a,b,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter starting value");
      a=sc.nextInt();
      System.out.println("Enter ending value");
      b=sc.nextInt();
      for(i=a;i<=b;i++)
        {
          if(checkPrimeNumber(i))
          {
            System.out.print(i+" ");
          }
        }
    }
  }