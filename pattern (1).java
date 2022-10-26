/*1
  2 8
  3 9 14
  4 10 15 19
  5 11 16 20 23
  6 12 17 21 24 26
  7 13 18 22 25 27 28*/
import java.util.*;
class pattern
  {
    public static void main(String args[])
    {
      int i,j,n;
      Scanner sc=new Scanner(System.in);

      for(i=1;i<=7;i++)
        {
          n=i;
          for(j=1;j<=i;j++)
            {
              System.out.print(n+" ");
              n=(n+7)-j;
            }
          System.out.println();
        }
    }
  }