import java.util.ArrayList;
public class Student1 {
int id;
String name;
public Student1(int id,String name)
{
	this.id=id;
	this.name=name;
}
public Student1()
{
	
}
public Student1(int id)
{
	this.id=id;
}
public String toString()
{
	return id+" "+name;
}

	public static void main(String[] args) {
		ArrayList<Object>a=new ArrayList<Object>();
		a.add(new Student1(102,"krish"));
		a.add(new Student1(103,"namo"));
		a.add(new Student1());
		a.add(new Student1(401));
	System.out.println(a);
	
	for(Object i:a)
	{
		System.out.println(i);
	}
		

	}

}
