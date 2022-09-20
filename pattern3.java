import java.util.Scanner;
class pattern3
  {
    public static void main(String args[])
    {
      int n=5,i,j;
      int ch=65;
      Scanner sc = new Scanner(System.in);
      
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=n;j++)
            {
              System.out.print((char)ch++ +" ");
            }
          System.out.println();
        }
    }
  }