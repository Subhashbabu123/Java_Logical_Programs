import java.util.Scanner;
class pattern2
  {
    public static void main(String args[])
    {
      int n=5,i,j;
      Scanner sc = new Scanner(System.in);
      
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=n;j++)
            {
              if(i==(n-j+1))
              System.out.print("$");
              else
                System.out.print("*");
            }
          System.out.println();
        }
    }
  }