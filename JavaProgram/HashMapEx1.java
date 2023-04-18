//WJP to create a collection class and print in random-Order
import java.util.HashMap;

public class HashMapEx1 {

public static void main(String[] args) {
		
HashMap<Integer,Student234> h=new HashMap<Integer,Student234>();
h.put(59, new Student234(102,"bittu"));
h.put(93, new Student234(123,"kajal"));
h.put(96, new Student234(93,"chhotu"));
h.put(99, new Student234(87,"rahul"));
System.out.println(h);
h.remove(93);
System.out.println(h);
h.clear();
System.out.println(h);
	}

}

class Student234
{
int id;
String name;
public Student234(int id,String name)
{
	this.id=id;
	this.name=name;
}
public String toString()
{
	return id+" "+name;
}
}
