import java.util.Scanner;
class calculator
  {
    public static void main(String args[])
    {
      int a=0;
      int b=0;
      int choice;
      int c;
      Scanner sc=new Scanner(System.in);

      System.out.println("[1] Addition");
      System.out.println("[2] Subtraction");
      System.out.println("[3] Multiplication");
      System.out.println("[4] Divison");
      System.out.println("[5] Remainder");
      System.out.println("enter your choice");
      choice=sc.nextInt();
      if(choice<=5)
      {
      System.out.println("enter a value");
      a=sc.nextInt();
      System.out.println("enter b value");
      b=sc.nextInt();
      }
      switch(choice)
        {
          case 1:
            c=a+b;
            System.out.println("The addition value is"+c);
            break;
          case 2:
            c=a-b;
            System.out.println("The subtraction value is"+c);
            break;
          case 3:
            c=a*b;
            System.out.println("The multiplication value is"+c);
            break;
          case 4:
            c=a/b;
            System.out.println("The divison is"+c);
            break;
          case 5:
            c=a%b;
            System.out.println("The remainder is"+c);
            break;
          default:
            System.out.println("wrong choice");
        }
    }
  }