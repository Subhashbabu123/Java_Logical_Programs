import java.util.Scanner;
class for_hollowpattern
  {
    public static void main(String args[])
    {
      int size=5;
      int i,j;

      for(i=1;i<=size;i++)
        {
          for(j=1;j<=size;j++)
            {
              if(i==1 || i==size)
              {
                System.out.print("*");
              }
              else
              {
                if(j==1 || j==size)
                {
                  System.out.print("*");
                }
                else
                {
                  System.out.print(" ");
                }
              }
            }
          System.out.println();
        }
    }
  }