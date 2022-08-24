import java.util.Scanner;
class Area_Circumference
{
  public static void main(String[] args)
  {
    int circum;
    int l;
    int b;
    double ar;
Scanner cir=new Scanner(System.in);
System.out.println("Enter length ");
l=cir.nextInt();
System.out.println("Enter the breadth  ");
b=cir.nextInt();
ar=l+b;
circum=2*(l+b);
System.out.println("The area of the rectangle is "+ar);
    
System.out.println("The circumference of the rectangle is "+circum);   
  }
}