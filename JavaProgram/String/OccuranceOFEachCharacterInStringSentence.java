package String;

import java.util.LinkedHashSet;

class OccuranceOFEachCharacterInStringSentence
{
	public static void main(String []args)
	{
		String s="my lovely countery";
		String[] st=s.split(" ");
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for (int i = 0; i < st.length; i++)
		{
		for(int j=0;j<st[i].length();j++) 
		{
			 set.add(st[i].charAt(j));
		 }
		}
		System.out.println(set);
		for(Character c:set) {
			int count=0;
			for (int i = 0; i < st.length; i++)
			{
				
			for(int j=0;j<st[i].length();j++) 
			{
				if(c.equals(st[i].charAt(j))) 
				{
					count++;
				}
				  
			 }
			
			}
			if(count>=1) {
				System.out.println(c+" is count "+count);	
			  }
			
		}
		
	}
}