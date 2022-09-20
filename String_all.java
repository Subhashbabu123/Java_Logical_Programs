//write a program to print the all occurance of character in a given String
import java.util.Scanner;
class String_all
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

      int count=0;
      for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)==ch)
          {
            System.out.println("The character"+ch+" occur at index"+i);
            count++;
          }
           
        }
     System.out.println("The character"+ch+" occur "+count+" time");
    }
  }