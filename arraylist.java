import java.util.*;
class arraylist
  {
    public static void main(String args[])
    {
      ArrayList<String> alist=new ArrayList<String>();

      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
      System.out.println(alist);
       
      alist.add(2,"Subhash");
      System.out.println(alist);

      alist.set(4,"John");
      System.out.println(alist);

      alist.remove(4);
      alist.remove("Tom");
     for(String str:alist) 
     {
        System.out.println(str);  
     }
            //Collections.sort(alist);
    System.out.println("After Sorting:");
    //Traversing list through Iterator  
      Iterator itr=alist.iterator();  
      while(itr.hasNext())
    {  
       System.out.println(itr.next());  
    }
System.out.println("Number of elements in ArrayList: "+alist.size());
  }
  }