//write a program to print the count of words in a given String
import java.util.Scanner;
class Strings_split
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any String");
      String str=sc.nextLine();
      String[] words=str.split(" ");
      int count=0;

      for(int i=0;i<words.length;i++)
        {
          count++;
        }
      System.out.println("word count is:" +count);
    }
  }