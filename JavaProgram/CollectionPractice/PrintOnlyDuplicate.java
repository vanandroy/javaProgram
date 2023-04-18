package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class PrintOnlyDuplicate {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(Arrays.asList("ram","ram","shyam","shyam","phone","book","queen"));
		TreeSet<String> ts=new TreeSet<String>();
		for(String a:al) {
			if(ts.add(a)==false) {
				System.out.println(a);
			}
		}

	}

}
