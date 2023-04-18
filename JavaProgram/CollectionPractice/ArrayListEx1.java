package CollectionPractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListEx1 {
	int id;
	String name;
	String loc;
	public ArrayListEx1(int id,String name,String loc)
	{
		this.id=id;
		this.name=name;
		this.loc=loc;
	}
   public String toString()
{
	return id+" "+name+" "+loc;
}
   
   
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(new ArrayListEx1(123,"rajesh","patna"));
		al.add(new ArrayListEx1(234,"vivek","lkw"));
		for(Object i:al)
		{
			System.out.println(i);
		}
		
	}

}
