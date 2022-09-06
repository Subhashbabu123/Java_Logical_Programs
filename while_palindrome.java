import java.util.Scanner;
class while_palindrome
  {
  public static void main(String args[])
    {
    int n,r=0,d,t;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      t=n;
      while(n>0)
        {
          d=n%10;
          r=r*10+d;
          n=n/10;
        }
      if(r==t)
        System.out.println("the given number is PALINDROME NUMBER");
      else
        System.out.println("the given number is not a PALINDROME NUMBER");
    }
  }