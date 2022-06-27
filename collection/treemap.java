class TreeMap1
{  
 public static void main(String args[])
{  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"jignesh");    
      map.put(102,"dhruv");    
      map.put(101,"om");    
      map.put(103,"rahul");    
        
      for(Map.Entry m:map.entrySet())
{    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  