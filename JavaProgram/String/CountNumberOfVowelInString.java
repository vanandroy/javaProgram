package String;

public class CountNumberOfVowelInString {
	public static void main(String[] args) {
		String st="Engineer";
		String str=st.toLowerCase();
		char[] ch=str.toCharArray();
		int vo=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vo++;
				System.out.print(ch[i]+" ");
			}
		}
		System.out.println(": "+vo);
	}

}
