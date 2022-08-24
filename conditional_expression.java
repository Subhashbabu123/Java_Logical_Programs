import java.util.Scanner;

class conditional_expression{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A value: ");
    int a=sc.nextInt();
    System.out.println("Enter B value:");
    int b=sc.nextInt();
    System.out.println("Enter C value");
    int c=sc.nextInt();
    if (a==b && b==c && c==a)
    {
      System.out.println("All variables are equal");
      
    }
    else
    {
    System.out.println("All variables are not equal");
    }
  }
  
}