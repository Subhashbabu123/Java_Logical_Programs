import java.util.Scanner;
class pattern1
  {
    public static void main(String args[])
    {
      int n,i,j;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      for(i=1;i<=n;i++)
        {
          for(j=1;j<=n;j++)
            {
              if(j==i)
              System.out.print("$");
              else
                System.out.print("*");
            }
          System.out.println();
        }
    }
  }