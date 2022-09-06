import java.util.Scanner;
  class CONSUMER
  {
    public static void main(String args [])
    {
      int cno;
      String cname;
      int pmr;
       int lmr;
       double bill=0;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("The Given CONSUMER Number is:");
      cno=sc.nextInt();
      System.out.println("The Given CONSUMER Name is:");
      cname=sc.next();
      System.out.println("The Given PRESENT MONTH READING is:");
      pmr=sc.nextInt();
       System.out.println("The Given LAST MONTH READIND is:");
      lmr=sc.nextInt();
    
       int tu;
      tu=pmr-lmr;
      
      System.out.println("The Given CONSUMER Number is:"+cno);
      System.out.println("The Given CONSUMER Name is:"+cname);
      System.out.println("The Given PRESENT MONTH READING is:"+pmr);
      System.out.println("The Given LAST MONTH READING is:"+lmr);
      System.out.println("The total unit is:"+tu);

      
       if(tu<=50)
      {
       bill=tu*3.40;       
      }
      else if(tu<=100)
      {
        bill=50*3.40+(tu-50)*4.56;        
      }
      else if(tu<=200)
      {
        bill=50*3.40+50*4.56+(tu-100)*5.43;       
      }
      else if(tu<=300)
      {
        bill=50*3.40+50*4.56+100*5.43+(tu-200)*6.54;        
      }
      else if(tu>300)
      {
        bill=50*3.40+50*4.56+100*5.43+200*6.54+(tu-300)*7.54;       
      }
      else
      {
      System.out.println("The Given bill is :"  +bill);
      }
       System.out.println("The Given bill is:"+bill);
    }
  }