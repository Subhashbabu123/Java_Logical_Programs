import java.util.Scanner;
class while_factorial
  {
  public static void main(String args[])
    {
    int n;
      int fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
      
    while(n>=1)
      {
        fact=fact*n;
        n--;
      }
       System.out.println("factorial number is"+fact);
    }
  }