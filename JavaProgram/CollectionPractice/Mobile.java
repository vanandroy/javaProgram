package CollectionPractice;
import java.util.ArrayList;
import java.util.*;
public class Mobile implements Comparable<Mobile>
{
	int price;
	String brand;
	String color;
	public Mobile(int price,String brand,String color)
	{
		this.price=price;
		this.brand=brand;
		this.color=color;
	}
	public String toString()
	{
		return price+" "+brand+" "+color;
	}
	public int compareTo(Mobile m)
	{
		if(this.brand.compareTo(m.brand)>=1)
				return 1;
		else if(this.brand.compareTo(m.brand)<0)
		return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		
ArrayList<Mobile> al=new ArrayList<Mobile>();
al.add(new Mobile(123,"mi","wh"));
al.add(new Mobile(1023,"realme","bk"));
al.add(new Mobile(10023,"Apple x","blk"));
for(Mobile i:al)
{
	System.out.println(i);
}
Collections.sort(al);
System.out.println(al);

Iterator a=al.iterator();
while(a.hasNext())
{
	System.out.println(a.next());
}

ListIterator<Mobile> li=al.listIterator();
while(li.hasNext())
{
	System.out.println(li.next());
}
while(li.hasNext())
{
	System.out.println(li.hasPrevious());
}


	}

}
