package CollectionPractice;

import java.util.TreeSet;

public class StringToCharTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		String s="vivekanand";
		int size = s.length();
		for(int i=0;i<size;i++)
		{
			char ch = s.charAt(i);
			String str = String.valueOf(ch);
			ts.add(str);
		
		}
		
		System.out.println(ts);
		

	}

}
