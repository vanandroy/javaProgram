package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicateFromSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>(Arrays.asList("java","java","book","book","ram","shyam"));
		System.out.println(hs);
		System.out.println("+++++++++");
		 //for sorting 
		TreeSet<String> ts=new TreeSet<String>(Arrays.asList("java","java","book","book","ram","shyam"));
		System.out.println(ts);
		System.out.println("++++++++");
		
		
	}

}
