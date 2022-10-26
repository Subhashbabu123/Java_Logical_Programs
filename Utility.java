// Create class Utility with three static methods add() the first add will take 2 arguments, add them and return result, second add() will take 3 arguments , add them , and return the result third add() will accept an array of integers, add elements in the array and return the result. Invike the all the three overloadedd methods from main() within the same class.
import java.util.*;
class utill
  {
    static int add1(int a,int b)
    {
      int c;
      c=a+b;
      return c;
    }
    static int add2(int x,int y,int z)
    {
      int xyz;
      xyz=x+y+z;
      return xyz;
    }
  }
class Utility
  {
    public static void main(String args[])
    {
      utill u=new utill();
      int m=utill.add1(5,7);
      int n=utill.add2(10,20,30);
      System.out.println("Addition = "+m);
      System.out.println("Addition = "+n);
    }
  }