class Strings
  {
    public static void main(String args[])
    {
      String st1="HI";
      String st2="Hello";

      System.out.println("2nd Character in String:"+st2.charAt(2));
      System.out.println("the 'e' character position in String:"+st2.indexOf('e'));
      System.out.println("the 'e' character position in String:"+st2.lastIndexOf('e'));
      System.out.println("the substring of given String:"+st2.substring(1,4));
      System.out.println("length of given String:"+st2.length());
      System.out.println("the string1 in lower case:"+st1.toLowerCase());
      System.out.println("the string2 in upper case:"+st2.toUpperCase());
      System.out.println("concat of two Strings :"+st1.concat(st2));
      if(st1.equalsIgnoreCase(st2))
      {
      System.out.println("Both Strings are Equal");
      }
      else
      {
      System.out.println("Both Strings are Not Equal");
      }
    }
  }