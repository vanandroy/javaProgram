package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.Spring;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(Arrays.asList("Patna","Bihar","Ranchi","Gaya","Ara","Patna"));
		/*al.add("Patna");
		al.add("Bihar");
		al.add("Ranchi");
		al.add("Gaya");
		al.add("Ara");
		al.add("Patna");
		*/
		System.out.println("befor sort ");
		System.out.println(al);
		System.out.println("after sort in alphabetical order");
		Collections.sort(al);
		for(String a:al) {
			System.out.println(a);
		}
		System.out.println("========");
		Iterator<String> i=al.iterator();
		while(i.hasNext()) {
			String st=i.next();
			if(st=="Ara")
			{
				i.remove();
			}
		}
		System.out.println("after removal of Ara");
		System.out.println(al);
		

	}

}
