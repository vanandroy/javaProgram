package String;

public class FindMinLengthStringInTheStringArray {
	public static void main(String[] args) {
		String[] s= {"abc","abcdd","rv","abcd","ab"};
		String min_Length=s[0];
		for(int i=0;i<s.length;i++) {
			if(min_Length.length()>s[i].length()) {
				min_Length=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(min_Length.length()==s[i].length()) {
				System.out.print(s[i]+" ");
			}
		}
	}
}
