package String;

public class SegregateAlphaNumsAndSpecChars {
	public static void main(String[] args) {
		String st="a2B*C5?d";
		String alpha="";
		String num="";
		String spc="";
		char[] s=st.toCharArray();
		for(int i=0;i<s.length;i++) {
			if(s[i]>='a'&& s[i]<='z' || s[i]>='A' && s[i]<='Z') {
				alpha=alpha+s[i];
			}else if(s[i]>='0' && s[i]<='9')
			{
				num=num+s[i];
			}else {
				spc=spc+s[i];
			}
		}
		System.out.println(alpha+" "+num+" "+spc);
	}
}
