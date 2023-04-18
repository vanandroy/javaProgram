package String;

import java.util.LinkedHashSet;

public class PositionOfEachCharacterInStringWithoutDupl {
	public static void main(String[] args) {
		String s="Kannada";
		String st=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++) {
			set.add(s.charAt(i));
		}
		//1.output will be  k=1,a=2,n=3,d=6
       for(Character ch:set) {
//			for(int i=0;i<s.length();i++) {
//				if(ch==s.charAt(i)) {
//					System.out.println(ch+"  is present in "+(i+1)+" position");
//					break;
//				}
    	   //2.output will be  k=1,a=7,n=4,d=6
    	   for(int i=s.length()-1;i>=0;i--) {
    		   if(ch==s.charAt(i)) {
					System.out.println(ch+"  is present in "+(i+1)+" position");
					break;
			}
		}
	}
	}
}
