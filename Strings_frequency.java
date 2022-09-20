//write a program to count the frequency of a character in a String
import java.util.Scanner;
class Strings_frequency
{
  public static void main(String args[]){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any String ");
    str=sc.nextLine();
    int n=str.length();
    boolean visited[]=new boolean[n];
    
    for(int i=0;i<n;i++)
      {
      visited[i]=false;
      }
    System.out.println("element count");
     for(int i=0;i<n;i++)
       {
         if(visited[i]==true)
           continue;
       
       
       int count=1;
    for(int j=i+1;j<n;j++)
      {
        if(str.charAt(i) == str.charAt(j))
        {
          visited[j]=true;
        count++;
          
        }
      }  
      System.out.println(str.charAt(i) + "\t" +count);
       }
    
  }
}