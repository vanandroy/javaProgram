/*WJP to create a generic collection add elements 50,75,30,20,75
1.create another collection add 100 and 250 as elements
2.add first collection into second collection
3.put using for each loop
4.print using for loop
*/
import java.util.ArrayList;
public class CollectinArray {
	
public static void main(String[] args) {
		ArrayList<Integer>ob=new ArrayList<Integer>();
		ob.add(50);
		ob.add(75);
		ob.add(30);
		ob.add(20);
		ob.add(75);
		
		ArrayList<Integer>ob2=new ArrayList<Integer>();
		ob2.add(100);
		ob2.add(250);
		ob2.addAll(ob);
		System.out.println(ob2);
		System.out.println("printing using for each loop");
		/*  
		 for(Integer i:ob2)
		{
			System.out.println(i);
		}
		*/
		for (int i=0;i<ob2.size();i++)
		{
			System.out.println(ob2.get(i));
		}
	}

}
