//write a program to print the last occurance in a given String
import java.util.Scanner;
class Strings_last
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
      int index=str.lastIndexOf(ch);
      System.out.println("last occurance of a character" +ch+ "in a String" +str+ "is at index" +index);
    }
  }