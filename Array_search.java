import java.util.Scanner;
class Array_search
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,search;
      System.out.println("Enter value of memory locations:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter elements to array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the elements in an array is:");
      for(i=0;i<n;i++)
        {
          System.out.println("the a["+i+"] value is:"+a[i]);
        }
     System.out.println("enter search element");
      search=sc.nextInt();
      for(i=0;i<n;i++)
        {
          if(search==a[i])
          {
            System.out.println("element is found");
            break;
          }
        }
      if(i==n)
        System.out.println("element not found");
    }
  }