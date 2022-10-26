import java.util.Scanner;
class missing_num
  {
    public static void main(String args[])
    {
      
      int i,et,at,num;
      int a[]={1,2,3,4,6};
      int n=a.length;
      System.out.println("enter the numbers");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      et=(n+1)*((n+1)+1)/2;
      at=0;
      for(i=0;i<n;i++)
        {
          at=at+a[i];
        }
      System.out.println("estimated total:"+et);
      System.out.println("actual total:"+at);
      num=et-at;
      System.out.println("missing number is:"+num);
    }
  }