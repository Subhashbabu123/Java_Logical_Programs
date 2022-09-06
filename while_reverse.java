import java.util.Scanner;
class while_reverse
  {
  public static void main(String args[])
    {
    int n,rev=0,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      while(n>0)
        {
          d=n%10;
          rev=rev*10+d;
          n=n/10;
        }
      System.out.println("reverse number is" +rev);
    }
  }