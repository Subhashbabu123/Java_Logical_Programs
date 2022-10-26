import java.util.*;
class Hashmap1
  {
    public static void main(String args[])
    {
      //syntax for HashMap
      //HashMap<k,v> obj_name = new HashMap<k,v>();
      //here k is key and v is value
      //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
      HashMap<Integer, String> map = new HashMap<Integer, String>();
      //adding elements to map
      map.put(10, "Subhash");
      map.put(20, "Joseph");
      map.put(30, "Prakash");
      map.put(40, "Anil");
      map.put(50, "Joseph");
      map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " = " + entry.getValue());  
        }); 
      //adding duplicate key
      //map.put("Anil", 20);   //adding duplicate key
      System.out.println(map.get(30));
      System.out.println("size of the map is "+map.size());
      System.out.println(map.values());
      System.out.println(map.keySet());
    }
  }