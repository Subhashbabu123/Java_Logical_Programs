import java.util.Scanner;
class nested_if
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter A value");
      int a=sc.nextInt();
      System.out.println("enter B value");
      int b=sc.nextInt();
      System.out.println("enter C value");
      int c=sc.nextInt();

      if(a>b)
      {
        if(a>c)
          System.out.println("A is big");
        else
          System.out.println("C is big");
      }
      else
      {
        if(b>c)
          System.out.println("B is big");
        else
          System.out.println("C is big");
      }
    }
  }