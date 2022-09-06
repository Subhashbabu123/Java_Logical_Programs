import java.util.Scanner;
class Array_maxmin
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,max,min;
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
      max=a[0];
      min=a[0];
      for(i=0;i<n;i++)
        {
          if(max<a[i])
            max=a[i];
          if(min>a[i])
            min=a[i];
        }
      System.out.println("Maximum value is:"+max);
       System.out.println("Minimum value is:"+min);
    }
  }