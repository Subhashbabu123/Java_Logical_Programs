import java.util.*;
class Binarysearch
{
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,ser,first,last,mid;
      System.out.println("Enter Array Size:");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter Elements to Array:");  
      for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
      System.out.println("The Elements in an Array is:");  
      for(i=0;i<n;i++)
      System.out.println("\t"+arr[i]);       
      System.out.println("Enter the value for Search:");
      ser=sc.nextInt();
      first=0;
      last=n-1;
      mid = (first + last)/2;  
      while( first <= last )
       {  
         if ( arr[mid] < ser )
          {  
            first = mid + 1;     
          }
         else if ( arr[mid] == ser )
          {  
            System.out.println("Element is found at index: " + mid);  
            break;  
          }
         else
          {  
            last = mid - 1;  
          }  
          mid = (first + last)/2;  
       }  
       if ( first > last )
        {  
          System.out.println("Element is not found!");  
        }  

    }
}