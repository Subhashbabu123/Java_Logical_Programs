import java.io.*;
class BufferedReader1
{
  public static void main(String args[])throws IOException 
  {
     char ch;
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter Any Character:");
    ch=(char)br.read();

    System.out.println("The Given Character is :"+ch); 
  }
}