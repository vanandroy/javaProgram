package String;

public class ReverseTheWordInAString {
	public static void main(String[] args) {
		String s="I Am A Software Engineer";//I mA A erawtfoS reenignE
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++) {
			String str=st[i];
			for(int j=str.length()-1;j>=0;j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
