public class LinkedHashMap2 
{  
   public static void main(String args[]) 
{  
    Map<Integer,String> map=new LinkedHashMap<Integer,String>();        
     map.put(101,"jignesh");    
     map.put(102,"harsil");    
     map.put(103,"om");    
     System.out.println("Before invoking remove() method: "+map);     
    map.remove(102);  
    System.out.println("After invoking remove() method: "+map);    
   }      
}  