import java.util.Scanner;
class factorial
  {
  public static void main(String args[])
    {
    int i;
    int n;
      int fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
      
    for(i=1;i<=n;i++)
      {
       fact=fact*i;
      }
      System.out.println("the sum of factorial number is:"+fact);
    }
  }