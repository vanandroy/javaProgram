package CollectionPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>(Arrays.asList("ram","ram","ram"));
		
		System.out.println(hs);
	/*	hs.add("subs");
		System.out.println(hs);
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
*/	}

}
