import java.io.*;
class BufferedReader2
{
  public static void main(String args[])throws IOException 
  {
    int n;
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter Any Integer:");
    n=Integer.parseInt(br.readLine());
    // n=Float.parseFloat(br.readLine());
    System.out.println("The Given Integer value is :"+n); 
  }
}