package String;

public class SegregateAlphaNumsAndSpecChars {
	public static void main(String[] args) {
		String st="a2B*C5?d";
		String alpha="";
		String num="";
		String spc="";
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&& ch[i]<='z' || ch[i]>='A' && ch[i]<='Z') {
				alpha=alpha+ch[i];
			}else if(ch[i]>='0' && ch[i]<='9')
			{
				num=num+ch[i];
			}else {
				spc=spc+ch[i];
			}
		}
		System.out.println(alpha+" "+num+" "+spc);
	}
}
