import java.util.LinkedList;
import java.util.Collections;
public class Sbi23 implements Comparable<Sbi23>
{
	long accno;
	String name;
	long contact;
	public Sbi23(long accno,String name,long contact)
	{
		this.accno=accno;
		this.name=name;
		this.contact=contact;
	}

	public String toString()
	{
		return accno+" "+name+" "+contact;
	}
	public int compareTo(Sbi23 s)
	{
		if(this.accno>s.accno)
			return 1;
		else if
		(this.accno<s.accno)
			return -1;
		else
			return 0;
	}
public static void main(String[] args)
{
	LinkedList<Sbi23>s=new LinkedList<Sbi23>();
	s.add(new Sbi23(1234567l,"riya",234567788l));
	s.add(new Sbi23(12000567l,"tiya",2300067788l));
	s.add(new Sbi23(1230007l,"siya",234000088l));
	System.out.println("before sorting");
	System.out.println(s);
	System.out.println("after sorting");
	Collections.sort(s);
	System.out.println(s);
for (Sbi23 i:s)
	System.out.println(i);
}
	
	
}
