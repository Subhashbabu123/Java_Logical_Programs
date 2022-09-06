import java.util.Scanner;
class factorial2
  {
  public static void main(String args[])
    {
    int n;
      int fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
      
    for( ;n>=1;n--)
      {
        
       fact=fact*n;
      }
      System.out.println("the sum of factorial number is:"+fact);
    }
  }