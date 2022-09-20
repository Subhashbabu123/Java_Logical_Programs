import java.util.Scanner;
class Array_delete
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an Array");
      n=sc.nextInt();
      int a[]=new int[n];

      System.out.println("enter the elements in array");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the index at which element to be deleted");
      int index=sc.nextInt();

      System.out.println("remaining elements are:" +a[i]);
    }
  }