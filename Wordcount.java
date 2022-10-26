//program to count words in a string
import java.util.*;
class Wordcount
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any String");
      String st1=sc.nextLine();
      String words[]=st1.split(" ");
      int count=0;
      for(int i=0;i<words.length;i++)
        count++;
      System.out.println("word count:"+count);
    }
  }