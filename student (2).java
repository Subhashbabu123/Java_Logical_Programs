class student1
  {
    int sno;
    String sname;
    double savg;
    student1()
    {
      sno=12;
      sname="subhash";
      savg=56.56;
    }
    void display()
    {
      System.out.println("Student number is: "+sno);
      System.out.println("Student name is: "+sname);
      System.out.println("Student average is: "+savg);
    }
  }
class student
  {
    public static void main(String args[])
    {
      student1 s=new student1();
      s.display();
    }
  }