import java.util.Scanner;
  class consumer
  {
    public static void main(String args [])
    {
      int cno;
      String cname;
      int pmr;
       int lmr;
       double bill;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("The Given CONSUMER Number is:");
      cno=sc.nextInt();
      System.out.println("The Given CONSUMER Name is:");
      cname=sc.next();
      System.out.println("The Given PRESENT MONTH READING is:");
      pmr=sc.nextInt();
       System.out.println("The Given LAST MONTH READIND is:");
      lmr=sc.nextInt();
      double u=3.80;
      int tu;
      tu=pmr-lmr;

      bill=tu*+u;

      System.out.println("The Given CONSUMER Number is:"+cno);
      System.out.println("The Given CONSUMER Name is:"+cname);
      System.out.println("The Given PRESENT MONTH READING is:"+pmr);
      System.out.println("The Given LAST MONTH READING is:"+lmr);
      System.out.println("The Given bill is:"+bill);
    }
  }