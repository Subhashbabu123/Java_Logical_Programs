//write a program to print reverse case of given string

/*import java.util.Scanner;
class reverse_string
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str;
      String st1="";
      System.out.println("enter the string");
      str=sc.nextLine();
      char ch;
      for(int i=0;i<str.length();i++)
        {
          ch=str.charAt(i);
          st1=ch+st1;
        }
      System.out.println(st1);
    }
  }*/
import java.util.Scanner;
class reverse_string
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any string");
      String st1=sc.nextLine();
      char ch[]=st1.toCharArray();
      for(int i=ch.length-1;i>=0;i--)
        {
          System.out.print(ch[i]);
        }
    }
  }