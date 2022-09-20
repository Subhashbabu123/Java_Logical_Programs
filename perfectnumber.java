import java.util.*;
class perfect
{
  static int perfect(int n)
  { 
    int num,i=1,sum=0;
    num=n;
    while(i<n)
     {
        if(n%i==0)
        {
          sum=sum+i;
        }
       i=i+1;
      }
    return sum;
  }
}
class perfectnumber
{
  public static void main(String args[])
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
     n=sc.nextInt();
    int b=perfect.perfect(n);
    if(b==n)
      System.out.println("perfect number");
    else
      System.out.println("not a perfect number");
  }
}