import java.util.Scanner;

class if_else{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A value: ");
    int a=sc.nextInt();
        System.out.println("Enter B value: ");
    int b=sc.nextInt();
          
    if (a>b)
    {
      System.out.println("A is big");
      
    }
    else
    System.out.println("B is big");
  }
  
}