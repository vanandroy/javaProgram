package String;

public class OccuranceOFEachCharacterInString {
	public static void main(String[] args) {
		String s="Kannada";// k=1,a=3,n=2,d=1
//		String st=s.toLowerCase();
//		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
//		
//		for(int i=0;i<s.length();i++) {
//			set.add(st.charAt(i));
//		}
//		for( Character ch:set) {
//			int count=0;
//			for(int i=0;i<s.length();i++) {
//				if(ch==st.charAt(i)) {
//					count++;
//				}
//			}
//			System.out.println(ch+" is :"+count);
//			
//		}	
		int count[]=new int[128];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<128;i++) {
			if(count[i]!=0) {
				System.out.println((char)i+" count is---> "+count[i]+" times");
			}
		}
	}

}
