package String;

public class ReverseEachWordInSamePlaceOfString {
	public static void main(String[] args) {
		String s="I Am A Software Engineer"; //I mA A erawtfoS reenignE
		String st[]=s.split(" ");
		
		for(int i=0;i<st.length;i++) {
			String str=st[i];
			
			for(int j=str.length()-1;j>=0;j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
//		String[] word=str.split(" ");
//		String reverseString="";
//		for(String w:word) {
//			String reverseWord = " ";
//			for(int i=w.length()-1;i>=0;i--) {
//				reverseWord=reverseWord+w.charAt(i);
//			}
//			reverseString=reverseString+reverseWord+" ";
//		}
//		System.out.println("Reverse of --->>>>"+str+" is ----->>>>> "+reverseString);
		
	}
}
