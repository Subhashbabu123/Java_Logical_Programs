import java.util.*;
class Savings
  {
    public int maxSavings(int salaries[], int expences[])
    {
      int sav[]=new int[3];
      for(int i=0;i<sav.length;i++)
        {
          sav[i]=salaries[i]-expences[i];
        }
      int maxSav=sav[0];
      for(int i=0;i<sav.length;i++)
        {
          if(maxSav<sav[i])
          {
            maxSav=sav[i];
          }
        }
      return maxSav;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter salaries");
      int a[]=new int[3];
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter expences");
      int b[]=new int[3];
      for(int i=0;i<b.length;i++)
        {
          b[i]=sc.nextInt();
        }

      Savings obj=new Savings();
      int max=obj.maxSavings(a,b);
      System.out.println("Maximum Saving is = "+max);
    }
  }