import java.util.*;
class Linkedlist
  {
    public static void main(String args[])
    {
     LinkedList<String> list=new LinkedList<String>();
     //Adding elements to the Linked list
     list.add("Steve");
     list.add("Carl");
     list.add("Raj");

     System.out.println(list); 
       
      list.addFirst("Karun");
      list.addLast("John");
      list.add(2, "Glenn");
     System.out.println(list);
      
      list.removeFirst();
      //Removing Last element
      list.removeLast();

     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext())
     {
       System.out.println(iterator.next());
     }

    }
  }