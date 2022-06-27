public class TestJavafruts
{  
public static void main(String args[])
{  
HashSet<String> set=new HashSet<String>();  
set.add("mango");  
set.add("apple");  
set.add("banana");  
set.add("grepss");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  