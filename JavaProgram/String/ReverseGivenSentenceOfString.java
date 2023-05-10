package String;

public class ReverseGivenSentenceOfString {
	public static void main(String[] args) {
		String s="i am a software engineer";//engineer software a am i
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]+" ");
		}

	}

}
