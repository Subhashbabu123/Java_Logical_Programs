import java.util.Scanner;
class student
  {
    Scanner sc=new Scanner(System.in);
    int sno;
    String sname;
    int sub1,sub2,sub3;
    int total;
    double avg;
    void read()
    {
      System.out.println("enter student number");
      sno=sc.nextInt();
      System.out.println("enter student name");
      sname=sc.next();
      System.out.println("enter sub1 marks");
      sub1=sc.nextInt();
      System.out.println("enter sub2 marks");
      sub2=sc.nextInt();
      System.out.println("enter sub3 marks");
      sub3=sc.nextInt();
    }
  }
class derive1 extends student
  {
    void calculate()
    {
      total=sub1+sub2+sub3;
      avg=total/3;
    }
  }
class derive2 extends derive1
  {
    void report()
    {
      System.out.println("Student number is: "+sno);
      System.out.println("Student name is: "+sname);
      System.out.println("Student total marks is: "+total);
      System.out.println("Student average is: "+avg);
    }
  }
class multilevel
  {
    public static void main(String args[])
    {
      derive2 d=new derive2();
      d.read();
      d.calculate();
      d.report();
    }
  }