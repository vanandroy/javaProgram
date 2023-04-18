import java.util.HashSet;
import java.util.Iterator;
public class HashSetex1 {

	public static void main(String[] args) {
		/*HashSet<String> a=new HashSet<String>();
		a.add("rina");
		a.add("preeti");
		a.add("khushbu");
		a.add("mausham");
		a.add("moni");
		Iterator<String> i=a.iterator();
		*/
		HashSet<Float> a=new HashSet<Float>();
		a.add((float)30.76);
		a.add((float)35.76);
		a.add((float)86.76);
		a.add((float)25.76);
		a.add((float)89.76);
		Iterator<Float> i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
