//write a program to print the first occurance in a given String
import java.util.Scanner;
class Strings_first
  {
    public static void main(String args[])
    {
      String str;
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any String");
      str=sc.nextLine();
      
      System.out.println("enter the character");
      ch=sc.next().charAt(0);
      int index=str.indexOf(ch);
      System.out.println("first occurance of a character" +ch+ "in a String" +str+ "is at index" +index);
    }
  }