package String;

import java.util.LinkedHashSet;

public class CountNumberOfVowelsInAStringWtDuplicates {
	public static void main(String[] args) {
		String st="Engineer";
		String str=st.toLowerCase();
		char[] c=str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<c.length;i++) {
			set.add(c[i]);
		}
		int vo=0;
		for(Character ch:set) {
		
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vo++;
				System.out.print(ch+" ");
			}
		}
		System.out.println(": "+vo);
	}
}
