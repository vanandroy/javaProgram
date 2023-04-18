/*
 WJP to create a non generic collection add elements SQL,JAVA,120.2,100,JAVA
1. USE for and for each loop
2.remove 120.2 from the list

 */
import java .util.ArrayList;
public class CollectionEx2 {

	public static void main(String[] args) {
		ArrayList<Object>ob=new ArrayList<Object>();
		ob.add("SQL");
		ob.add("JAVA");
		ob.add(120.2f);
		ob.add(100);
		ob.add("JAVA");
		System.out.println(ob);
		System.out.println("the size of the list created is  "+ob.size());
		System.out.println("After removing index value 2");
		ob.remove(2);
		System.out.println("after removed  "+ob);
		
		System.out.println(ob.contains("mannual"));
		
		System.out.println(ob.contains("java"));
		System.out.println(ob.contains("JAVA"));//true;because JAVA in the List
		System.out.println(ob.contains("SQL"));
		System.out.println(ob.contains(88));//false;because 88 not in the List
	}

}
