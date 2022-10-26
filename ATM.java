//write a program to display ATM transactions
import java.util.Scanner;
class ATM
  {
    static void displayBalance(int balance)
    {
      System.out.println("Current Balance : "+balance);
    }
    static int amountWithdrawing(int balance,int withdrawAmount)
    {
      System.out.println("Withdrawn Operation");
      System.out.println("Withdrawing Amount : "+withdrawAmount);
      if(balance >= withdrawAmount)
      {
        balance=balance-withdrawAmount;
        System.out.println("Please collect your Money and take the Card");
        displayBalance(balance);
      }
      else
      {
        System.out.println("Sorry! Insufficient Funds");
      }
      return balance;
    }
    static int amountDepositing(int balance,int depositAmount)
    {
      System.out.println("Deposit Operation");
      System.out.println("Depositing Amount : "+depositAmount);
      balance=balance+depositAmount;
      System.out.println("Your Money is Successfully Deposited");
      displayBalance(balance);
      return balance;
    }
    public static void main(String args[])
    {
      int balance,withdrawAmount,depositAmount;
      Scanner sc=new Scanner(System.in);
      System.out.println("Current Balance");
      balance=sc.nextInt();
      System.out.println("Withdrawing Amount");
      withdrawAmount=sc.nextInt();
      System.out.println("Depositing Amount");
      depositAmount=sc.nextInt();

      displayBalance(balance);
      balance=amountWithdrawing(balance,withdrawAmount);
      balance=amountDepositing(balance,depositAmount);
    }
  }