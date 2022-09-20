class student_p
  {
    int sno;
    String sname;
    double savg;
    student_p(int x,String y,double z)
    {
      sno=x;
      sname=y;
      savg=z;
    }
    void display()
    {
      System.out.println("Student number is: "+sno);
      System.out.println("Student name is: "+sname);
      System.out.println("Student average is: "+savg);
    }
  }
class student1_p
  {
    public static void main(String args[])
    {
      int m=12;
      String n="subhash";
      double o=56.56;
      student_p s=new student_p(m,n,o);
      s.display();
    }
  }