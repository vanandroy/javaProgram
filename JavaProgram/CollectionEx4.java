import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Collections;
public class CollectionEx4 {
	

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(12);
		a.add(98);
		a.add(34);
		a.add(78);
		a.add(96);
		a.add(14);
		//for(int i=0;i<=a.size();i++)
		Iterator r=a.iterator();
		while(r.hasNext()==true)
		{
			
			
			System.out.println(r.next());
		}
		System.out.println(a);
		/*System.out.println(a);
	
		for(Integer i:a)
			System.out.println(i);
		Collections.sort(a);
		System.out.println(a);
		
*/
	}

}
