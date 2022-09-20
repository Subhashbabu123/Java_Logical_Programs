import java.util.Scanner;
class pattern6
  {
    public static void main(String args[])
    {
      int n=5,i,j;
  
      Scanner sc = new Scanner(System.in);
      
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=(n-i)+1;j++)
            {  
                System.out.print(n-j+1);
            }
          System.out.println();
        }
    }
  }