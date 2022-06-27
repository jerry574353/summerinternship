class TreeMap1
{  
 public static void main(String args[])
{  
   SortedMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"jp");    
      map.put(102,"mp");    
      map.put(101,"kp");    
      map.put(103,"rj");    
      System.out.println("headMap: "+map.headMap(102));  
      System.out.println("tailMap: "+map.tailMap(102));  
      System.out.println("subMap: "+map.subMap(100, 102));    
 }  
}  