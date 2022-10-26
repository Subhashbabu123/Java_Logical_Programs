import java.util.*;
class Sort
{
  Scanner sc=new Scanner(System.in);
  void acceptArray(int a[],int n)
  {
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
  }
  void dispArray(int a[],int n)
  {
     for(int i=0;i<n;i++)
       {
         System.out.print("\t"+a[i]);
       }  
  }
  void sortArray(int a[],int n)
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
  
}
class selectionsorting
  {
     public static void main(String args[])
     {
         int n,i;
       Bubble_Sort bs=new Bubble_Sort();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Array Size:");
       n=sc.nextInt();
       int a[]=new int[n];

       System.out.println("Enter Elements to Array:");
       bs.acceptArray(a,n);

       System.out.println("The Elements Before Sorting:");
       bs.dispArray(a,n);

       bs.sortArray(a,n);

      System.out.println("\nThe Elements After Sorting:");
       bs.dispArray(a,n);
       
     }
  }