import java.util.Scanner;
class VOWEL{
  public static void main(String args[]){

    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a character:");
    ch=sc.next().charAt(0);
    if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
    {
    switch(ch)
      {
        case 'A': case 'a':
        case 'E': case 'e':
        case 'I': case 'i':
        case 'O': case 'o':
        case 'U': case 'u':
          System.out.println("Its Vowel");
          break;
        default:
          System.out.println("Its Consonent");
      }
    }
     else 
      System.out.println("alphabets only");
  }
}