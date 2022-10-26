import java.io.*;
class StudentData
{
   public static void main(String args[])throws Exception
    {
      int sno,m1,m2,m3,tot;
      String sname;
      float avg;
      DataInputStream dis=new DataInputStream(System.in);
      System.out.println("Enter Student Number :");
      sno=Integer.parseInt(dis.readLine());
      System.out.println("Enter Student Name :");
      sname=dis.readLine();
      System.out.println("Enter Student Marks :");
      m1=Integer.parseInt(dis.readLine());
      m2=Integer.parseInt(dis.readLine());
      m3=Integer.parseInt(dis.readLine());
      tot=m1+m2+m3;       
      avg=tot/3;
          System.out.println("----Student Report-----");
        System.out.println("The Student Number is:"+sno);
        System.out.println("The Student Name is:"+sname);     
        System.out.println("The Student Marks TOtal is:"+tot);         
        System.out.println("The Student Avrage is:"+avg);
     }
}    