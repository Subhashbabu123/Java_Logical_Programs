class Condemo1
  {
    int a,b;
   Condemo1()
    {
       a=10;
       b=20;
    }
    void display()
    {
      System.out.println("The A value is:"+a);
      System.out.println("The B value is:"+b);
      System.out.println("The Addition value is:"+(a+b));
    }
  }
class CONDEMO
  {
     public static void main(String args[])
     {
       Condemo1 c1=new Condemo1();
       c1.display();   
     }
  }