import java.util.Scanner;
class dowhile_factorial
  {
    public static void main(String args[])
    {
      int n,fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      n=sc.nextInt();

      int i=1;
      do
        {
          fact=fact*i;
          i++;
        }
        while(i<=n);
      System.out.println("the factorial of given number is:"+fact);
    }
  }