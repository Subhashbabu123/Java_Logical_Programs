import java.util.Scanner;

class leap_year{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year: ");
    int a=sc.nextInt();
          
    if (a%400==0&&4==0)
    {
      System.out.println("year is leap year");
      
    }
    else
    {
    System.out.println("year is not a leap year");
    }
  }
  
}