import java.util.Scanner;
  class EMPLOYEE
  {
    public static void main(String args [])
    {
      int eno;
      String ename;
      float esal;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("The Given EMP Number is:");
      eno=sc.nextInt();
      System.out.println("The Given Emp Name is:");
      ename=sc.next();
      System.out.println("The Given Emp Salary is:");
      esal=sc.nextFloat();

      System.out.println("The Given EMP Number is:"+eno);
      System.out.println("The Given EMP Number is:"+ename);
      System.out.println("The Given EMP Number is:"+esal);
    }
  }