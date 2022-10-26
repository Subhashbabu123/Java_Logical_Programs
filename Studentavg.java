import java.io.*;
class Studentavg
{
   public static void main(String args[])throws IOException
    {
       int sno,m1,m2,m3,tot;
        String sname;
        float avg;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter Student Number :");
      sno=Integer.parseInt(br.readLine());
      System.out.println("Enter Student Name :");
      sname=br.readLine();
      System.out.println("Enter Student Marks :");
      m1=Integer.parseInt(br.readLine());
      m2=Integer.parseInt(br.readLine());
      m3=Integer.parseInt(br.readLine());
      tot=m1+m2+m3;   
      System.out.println("The Student Total is:"+tot);
      avg=tot/3;
      System.out.println("The Student average is:"+avg);
     }
}    