import java.util.Scanner;
class while_fibonacci
  {
    public static void main(String args[])
    {
      int n,f1=1,f2=0,f3=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      while(n>0)
        {
          System.out.print("\t"+f3);
          f3=f1+f2;
          f1=f2;
          f2=f3;
          n--;
        }
    }
  }