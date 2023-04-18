package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		//Tree Set
		System.out.println("Tree Set");
		TreeSet<String> ts=new TreeSet<String>(Arrays.asList("ramesh","raju","rahul","raju","abhi","manoj"));
		System.out.println(ts);
		
		//ArrayList
		System.out.println("ArrayList");
		ArrayList<String> al=new ArrayList<String>(Arrays.asList("ramesh","raju","rahul","raju","abhi","manoj"));
		System.out.println(al);
		System.out.println("iterator");
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//HashSet
		System.out.println("HashSet");
		HashSet<String> hs=new HashSet<String>();
		hs.addAll(al);
		System.out.println(hs);

	}

}
