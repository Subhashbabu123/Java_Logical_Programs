interface calculator
  {
    public int add(int a, int b);
    public int sub(int a, int b);
    public int mul(int a, int b);
    public float div(float a, float b);
  }
class IntegerCalculator implements calculator
  {
    int c,d,e;
    float f;
    public int add(int a, int b)
    {
      
     c= a+b;
      return c;
    }
    public int sub(int a, int b)
    {
      d=a-b;
      return d;
    }
    public int mul(int a, int b)
    {
      e=a*b;
      return e;
    }
    public float div(float a, float b)
    {
      f=a/b;
      return f;
    }  
  }
  class MyCalculator
    {
      public static void main(String args[])
      {
        IntegerCalculator ic =new IntegerCalculator();

        System.out.println(ic.add(10,20));
        System.out.println(ic.sub(10,5));
        System.out.println(ic.mul(10,20));
        System.out.println(ic.div(8,3));  
      }
    }