import java.util.Scanner;
class jump_even
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();

      for(int i=0;i<=n;i++)
        {
          if(i%2!=0)
           continue;
          System.out.println(i);
        }
    }
  }