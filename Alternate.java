//write a program to print alternate elements in an Array
import java.util.Scanner;
class Alternate
{
  public static void main(String args[]){
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements of the array ");
    for (i=0;i<n;i++)
      {
      a[i]=sc.nextInt();
      }
    System.out.println("Alternate Elements are :");
    for(i=0;i<n;i=i+2)
      {
        System.out.println(a[i]);
      }
  }
}