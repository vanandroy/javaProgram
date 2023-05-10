package String;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class OccuranceOfEachWordFromTheString {
	public static void main(String[] args) {
		String st="I am I am a Software a Engineer";
		String[] s=st.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();	
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		for( String str:set) {
			int count=0;
			for(int i=s.length-1;i>=0;i--) {
				if(str.equals(s[i])) {
					count++;
				}
			}
			System.out.println(str+" is repeating :"+count+ "times");
		}
//		Iterator<String> itr = set.iterator();
//		while(itr.hasNext())
//		{
//			String word = itr.next();
//			int count = 0;
//			for(int i=0 ; i<s.length ; i++)
//			{
//				if(word.equals(s[i]))
//				{
//					count++;
//				}
//			}
//			System.out.println(word + "  occuring "+count+" times");
//		}
			
		}	 

	}