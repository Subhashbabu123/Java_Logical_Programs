import java.util.Scanner;
class multi_array3
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int r1,c1,r2,c2,i,j;
      System.out.println("enter order for first matrix:");
      r1=sc.nextInt();
      c1=sc.nextInt();
      System.out.println("enter order for second matrix:");
      r2=sc.nextInt();
      c2=sc.nextInt();

      int a[][]=new int[r1][c1];
      int b[][]=new int[r2][c2];
      int c[][]=new int[r1][c1];

      if(r1==r2 && c1==c2)
      {
      System.out.println("enter elements in array of first matrix:");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("enter elements in array of second matrix:");
      for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
            {
              b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
            {
              c[i][j]=0;
              for(int k=0;k<c2;k++)
                {
                  c[i][j]=a[i][k]*b[k][j];
                }
            }
        }
         System.out.println("elements in an array of first matrix is:");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print(" "+a[i][j]);
            }
          System.out.println();
        }
         System.out.println("elements in an array of second matrix is:");
      for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
            {
              System.out.print(" "+b[i][j]);
            }
          System.out.println();
        }
      System.out.println("elements in an array of multiplication matrix is:");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print(" "+c[i][j]);
            }
          System.out.println();
        }
      }
      else
      {
        System.out.println("Matrix addition is not possible");
      }
    }
  }