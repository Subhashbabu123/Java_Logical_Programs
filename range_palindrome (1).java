import java.util.*;

class range_palindrome
  {
  public static void main(String args[]) 
    {
    int r, n, t, rev = 0,i,d;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value:");
    r = sc.nextInt();
    for (n = 1; n <=r; n++) 
    {
      t=n;
      for (i = 1; i <= r; i++) 
      {
        d=n%10;
        rev=rev*10+d;
        n=n/10;
      }
     if(rev==t)
        System.out.println(rev);  
    }
  }
}