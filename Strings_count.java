import java.util.*;
class Strings_count
  {
    public static void main(String args[])
    {
      String st1="Hello@123$";
      int i,a=0,A=0,d=0,s=0;
      char ch;

      for(i=0;i<st1.length();i++)
        {
          ch=st1.charAt(i);
          if(ch>=65 && ch<=90)
            A++;
          else if(ch>=97 && ch<=120)
            a++;
          else if(ch>=48 && ch<=57)
            d++;
          else
            s++;
        }
      System.out.println("number of alphabet capital characters:" +A);
      System.out.println("number of alphabet small characters:" +a);
      System.out.println("number of digit characters:" +d);
      System.out.println("number of special characters:" +s);
    }
  }