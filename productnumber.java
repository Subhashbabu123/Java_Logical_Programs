import java.util.Scanner;
  class productnumber
  {
    public static void main(String args [])
    {
      int pno;
      String pname;
      double pcost;
      double pqty;
      double bill;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("The Given PRO Number is:");
      pno=sc.nextInt();
      System.out.println("The Given PRO Name is:");
      pname=sc.next();
      System.out.println("The Given PRO Cost is:");
      pcost=sc.nextDouble();
      System.out.println("The Given PRO Quntity is:");
      pqty=sc.nextDouble();
      
      bill=pcost*pqty;
      
      System.out.println("The Given PRO Number is:"+pno);
      System.out.println("The Given PRO Name is:"+pname);
      System.out.println("The Given PRO cost is:"+pcost);
      System.out.println("The Given PRO Quntity is:"+pqty);
      System.out.println("The Given bill is:"+bill);
    }
  }