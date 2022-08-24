import java.util.Scanner;

class even_number{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A value: ");
    int a=sc.nextInt();
          
    if (a%2==0)
    {
      System.out.println("A is even number");
      
    }
    else
    {
    System.out.println("A is not an even number");
    }
  }
  
}