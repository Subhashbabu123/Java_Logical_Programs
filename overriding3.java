class overriding
{
   int n=100;
   void disp()
   {
     System.out.println("The n value is:"+n);
   }
}

class overriding1 extends overriding
{
   int m=200;
   void disp()
    {
   System.out.println("The m value is:"+m);
    }
}
class overriding3
{
  public static void main(String args[])
   {
     overriding p1=new overriding();
     overriding1 p2=new overriding1();
     overriding a;
     a=p1;
     a.disp();
     a=p2;
     a.disp();
   }
}