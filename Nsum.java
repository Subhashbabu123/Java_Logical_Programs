import java.io.*;
class Nsum
{
  public static void main(String args[]) throws IOException
  {
    int n,i,sum=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a number:");
    n=Integer.parseInt(br.readLine());
    for(i=0;i<=n;i++)
    {
	    sum=sum+i;                  
    }
    System.out.println(sum);
  }
}
