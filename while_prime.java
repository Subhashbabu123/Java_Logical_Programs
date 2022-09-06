import java.util.Scanner;
class while_prime
  {
  public static void main(String args[])
    {
    int n,i=1,c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      while(i<=n)
        {
          if(n%i==0)
          {
            c++;
          }
          i++;
        }
      if(c==2)
        System.out.println("It is PRIME NUMBER");
      else
        System.out.println("It is not PRIME NUMBER");
    }
  }