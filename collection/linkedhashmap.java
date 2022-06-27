class LinkedHashMap1
{  
 public static void main(String args[])
{  
   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"jignesh");  
  hm.put(101,"kishan");  
  hm.put(102,"om");  
  
for(Map.Entry m:hm.entrySet())
{  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  