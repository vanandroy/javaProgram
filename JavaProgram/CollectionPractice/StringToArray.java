package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class StringToArray {

	public static void main(String[] args) {
		String s="abbbcdeffg";
		int size=s.length();
		TreeSet<String> ts=new TreeSet<String>();//for unique objects only
		ArrayList<String> al=new ArrayList<String>();//for all objects
		for(int i=size-1;i>=0;i--) 
		{
			char ch = s.charAt(i);
			String c=String.valueOf(ch);	
			ts.add(c);
			al.add(c);
			}
		Collections.sort(al);
		System.out.println(al);
		System.out.println("++++++++++++++++++++");
		System.out.println(ts);
		
		
		
		
		

	}

}
