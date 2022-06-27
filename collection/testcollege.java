public class TestJavacollege
{  
public static void main(String args[])
{  
TreeSet<String> set=new TreeSet<String>();  
set.add("college id");  
set.add("college name");  
set.add("college department");  
set.add("college code");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  