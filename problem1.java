import java.util.Scanner;

class problem1
{
  public static void main(String args[]){
     int p;
     int t;
     int r;
     Scanner num=new Scanner(System.in);
  System.out.println("Enter first number");
    p=num.nextInt();
  System.out.println("Enter second number");
    t=num.nextInt();
  System.out.println("Enter third number");
    r=num.nextInt();
    int si;
    si=(p*t*r);
    System.out.println("the value of si is :"+si);
    int ta;
    ta=(p+si);
    System.out.println("the value of ta is :"+ta);
  }
}