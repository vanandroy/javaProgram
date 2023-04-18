package CollectionPractice;

import java.util.HashMap;
import java.util.TreeMap;

class exp
{
	public static void main(String args[])
	{
		TreeMap<Integer,HashMapEx1 > al=new TreeMap<Integer,HashMapEx1 >();
		al.put(21, new HashMapEx1(123,"ram") );
		al.put(23, new HashMapEx1(12345,"raamya"));
		
		System.out.println(al);
		
		
	}
}