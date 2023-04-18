package String;

public class FindMaxLengthStringInTheStringArray {
	public static void main(String[] args) {
		String[] s= {"abc","abcde","rv","abcd","ab","12346"};
		String max_Length=s[0];
		for(int i=0;i<s.length;i++) {
			if(max_Length.length()<s[i].length()) {
				max_Length=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(max_Length.length()==s[i].length()) {
				System.out.print(s[i]+" ");
			}
		}
	}

}
