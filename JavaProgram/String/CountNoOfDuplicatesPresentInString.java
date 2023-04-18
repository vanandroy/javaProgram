package String;

import java.util.LinkedHashSet;

public class CountNoOfDuplicatesPresentInString {
	public static void main(String[] args) {
		String s="kannada";
//		int [] count=new int[128];
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			count[ch]++;
//		}
//		for(int i=0;i<128;i++) {
//			if(count[i]=='k'||count[i]=='a'||count[i]=='n'||count[i]=='d') {
//				System.out.println((char)i+" count is---> "+count[i]+" times");
//			}
//		}
		String st=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(st.charAt(i));
		}
		for( Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==st.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(ch+" is repeating "+count+" times");
			}
			
		}
	}

}
