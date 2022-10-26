// * * * * *
//       * * * *
//             * * * 
//                   * *
//                        *
/* * * * * *
     * * * *
       * * *
         * *
           * */
import java.util.*;
class pattern1
  {
    public static void main(String args[])
    {
      int i,j;
      Scanner sc=new Scanner(System.in);

      for(i=5;i>=1;i--)
        {
          for(j=5;j>i;j--)
            {
              System.out.print("   ");
            }
          for(int k=1;k<=i;k++)
            {
              System.out.print("*");
            }
          System.out.println();
        }
    }
  }