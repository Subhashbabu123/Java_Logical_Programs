import java.util.Scanner;
class number_for
  {
  public static void main(String args[])
    {
    int i;
    int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
      
    for(i=1;i<=10;i++)
      {
        System.out.println(+i +"x"+n+"="+(i*n));
      }
    }
  }