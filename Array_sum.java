import java.util.Scanner;
class Array_sum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,sum=0;
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
      i=0;
      while(i<n){
        sum=sum+a[i];
        i++;
      }
      System.out.println(sum);
    }
  }