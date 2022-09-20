class factorial
{
   int n,fact;  
   void fact()
  {
     n=5;
     fact=1;
     for(int i=1;i<=n;i++)
       {
         fact=fact*i;
       }
     System.out.println("The factorial is:"+fact);
  }
}
class OOPS_factorial
  {
     public static void main(String args[])
    {
       factorial n=new factorial();
       n.fact();
    }
}