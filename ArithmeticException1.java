import java.util.*;
class exception1
{
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  void div()
  {
    try
    {                   
      System.out.println("Enter a,b values:");
      a=sc.nextInt();
      b=sc.nextInt();        
      c=a/b;
      System.out.println("The Exception is:"+c);
    }
    catch(ArithmeticException ae)
    {
      System.out.println("An Exception Occured");  
      System.out.println("An Exception Occured"+ae);  
      System.out.println("An ExceptioOccured"+ae.getMessage()); 
    }       
  }
}
class ArithmeticException1
{
  public static void main(String args[])
    {
      exception1 ex=new exception1();
      ex.div();
    }
}