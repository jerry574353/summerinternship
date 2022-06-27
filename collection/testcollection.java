import java.io.*;  
class TestJavaCollection1
{  
public static void main(String args[])
{  
ArrayList<String> list=new ArrayList<String>();
list.add("jignesh");
list.add("harsil");  
list.add("om");  
list.add("kishan");  
Iterator itr=list.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  