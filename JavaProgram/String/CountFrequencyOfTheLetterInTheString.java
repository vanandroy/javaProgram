package String;

import java.util.Iterator;
import java.util.LinkedHashSet;

//IP = aaabbcdddf op= a3b2cd3f
public class CountFrequencyOfTheLetterInTheString {

	public static void main(String[] args) {
		String s = "aaabbcdddf";
		LinkedHashSet<Character> a1 = new LinkedHashSet<>();
		
		for(int i=0 ; i<s.length() ; i++)
		{
			a1.add(s.charAt(i));
		}
		String sum = "";
		Iterator<Character> itr = a1.iterator();
		while(itr.hasNext())
		{
			char ch = itr.next();
			int count =0;
			for(int i=0 ; i<s.length() ; i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
				sum = sum+ch+count;
			else
				sum =sum+ch;
			
		}
		System.out.println(sum);
	
	
		
	}
}
