package String;

public class ReverseTheGivenString {
	public static void main(String[] args) {
		String s="i am a software engineer";
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]+" ");
		}

	}

}
