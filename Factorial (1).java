import java.util.Scanner;
class fact
  {
    int n;
    fact()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
    }
  }
interface FACT
  {
    public void factorial();
    public void disp();
  }
class FACTORIAL extends fact implements FACT
  {
    int i,f=1;
    public void factorial()
    {
      for(i=1;i<=n;i++)
        {
          f=f*i;
        }
    }
    public void disp()
    {
      System.out.println("Factorial of given number is: "+f);
    }
  }
class Factorial
  {
    public static void main(String args[])
    {
      FACTORIAL f=new FACTORIAL();
      f.factorial();
      f.disp();
    }
  }