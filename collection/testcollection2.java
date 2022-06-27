public class TestJavaCollection2
{  
public static void main(String args[])
{  
LinkedList<String> al=new LinkedList<String>();  
al.add("jignesh");  
al.add("harsil");  
al.add("om");  
al.add("kishan");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  