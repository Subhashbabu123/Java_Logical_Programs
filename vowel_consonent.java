import java.util.Scanner;

class vowel_consonent
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter any character:");
      ch=sc.next().charAt(0);

      if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
      {
        System.out.println("Its vowel");
      }
     else
      {
        System.out.println("Its consonent");
      }
    }
  }