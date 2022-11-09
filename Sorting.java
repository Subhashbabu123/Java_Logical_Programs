import java.util.*;
class Sorting
  {
    Scanner sc=new Scanner(System.in);
    public void read(int a[],int n)
    {
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
    }
    public void sort(int a[],int n)
    {
      int i,j,t;
      for(i=0;i<n-1;i++)
        {
          for(j=i+1;j<n;j++)
            {
              if(a[i]>a[j])
              {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
              }
            }
        }
    }
    public void display(int a[],int n)
    {
     for(int i=0;i<n;i++)
       {
         System.out.print(a[i]+" ");
       }  
    }
    public static void main(String args[])
    {
      Sorting s=new Sorting();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Array Size:");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter Elements to Array:");
      s.read(a,n);
      s.sort(a,n);
      System.out.println("The Elements After Sorting:");
      s.display(a,n);
    }
  }