import java.util.*;

class range_prime
  {
  public static void main(String args[]) 
    {
    int r, n, i, c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value:");
    r = sc.nextInt();
    for (n = 1; n <=r; n++) 
    {
      c = 0;
      for (i = 1; i <= r; i++) 
      {
        if (n%i == 0) 
        {
          c++;
        }
      }
     if(c==2)
        System.out.println(n);  
    }
  }
}