import java.util.Scanner;
class dowhile_natural
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      n=sc.nextInt();

      do
        {
          System.out.println(n);
          n++;
        }
        while(n<=10);
    }
  }