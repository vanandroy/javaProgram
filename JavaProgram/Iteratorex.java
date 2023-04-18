import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Iteratorex {
	
	
	int id;
	String name;
	public Iteratorex(int id,String name)
	{
		this.id=id;
		this.name=name;	
	}
	
	public String toString()
	{
		return id+" "+name;
	}

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(102);
	
		a.add(120);
		a.add(180);
		a.add(852);
		System.out.println(a.size());
		System.out.println("actual list is "+a);
ListIterator<Object> ob=a.listIterator();
//System.out.println(ob);
System.out.println("printing element forward direction  ");

while(ob.hasNext()==true)
	
{
		System.out.println(ob.next());

}
System.out.println("printing element in backward direction");
while(ob.hasPrevious()==true)
{
	System.out.println(ob.previous());
}

	}

}
