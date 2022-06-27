public class TestJavaanimal
{  
public static void main(String args[])
{  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("dog");  
set.add("cow");  
set.add("line");  
set.add("camal");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext())
s{  
System.out.println(itr.next());  
}  
}  
}  