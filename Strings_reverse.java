class Strings_reverse
  {
    public static void main(String args[])
    {
      String st1="WELCOME";

      System.out.println("the reverse of the given String is:");
      for(int i=st1.length();i>0;i--)
        {
          System.out.print(st1.charAt(i-1));
        }
    }
  }