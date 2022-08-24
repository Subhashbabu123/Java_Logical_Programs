import java.util.Scanner;
class vowel{
  public static void main(String args[]){

    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a character:");
    ch=sc.next().charAt(0);

    if(ch=='A')
      System.out.println("Its vowel");
    else if(ch=='E')
      System.out.println("Its vowel");
    else if(ch=='I')
      System.out.println("Its vowel");
    else if(ch=='O')
      System.out.println("Its vowel");
    else if(ch=='U')
      System.out.println("Its vowel");
    else
      System.out.println("Its consonent");
  }
}