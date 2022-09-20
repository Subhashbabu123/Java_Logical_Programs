import java.util.Scanner;
class Array_copy
{
  public static void main(String args[]){
    int i;

    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size ");
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];

    System.out.println("Enter the elements of the array ");
    for (i=0;i<n;i++)
      {
      a[i]=sc.nextInt();
      }
    /*for(i=0;i<n;i++)
      {
        b[i]=a[i];
      }*/
    b=a;
    System.out.println("the elements of the new array ");
    for (i=0;i<n;i++)
      {
       System.out.println(b[i]);
      }
  }
}