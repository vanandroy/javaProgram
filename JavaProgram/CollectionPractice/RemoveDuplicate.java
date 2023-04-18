package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

class RemoveDuplicate
{
	public static void main(String []args){
		//Integer
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,1,1,2,3,3,3,4,4,5,5,6,8));
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>(al);
		ArrayList<Integer> all=new ArrayList<Integer>(ls);
		System.out.println(all);
		//String
		ArrayList<String> as=new ArrayList<String>(Arrays.asList("ram","ram","your","your"));
		LinkedHashSet<String> lhs=new LinkedHashSet<String>(as);
		ArrayList<String> rd=new ArrayList<String>(lhs);
		System.out.println(rd);
		//Object
		ArrayList<Object> ao=new ArrayList<Object>(Arrays.asList("ram","ram","your","your",1,23,23,1));
		LinkedHashSet<Object> lhs1=new LinkedHashSet<Object>(ao);
		ArrayList<Object> r=new ArrayList<Object>(lhs1);
		System.out.println(r);
	}
}
