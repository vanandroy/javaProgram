package String;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordFromTheString {
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

	}
}
