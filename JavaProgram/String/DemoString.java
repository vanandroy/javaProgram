package String;

public class DemoString {

	public static void main(String[] args) {
		String s="apple";
		int vCount=0,cCount=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vCount++;
			}
			else {
				cCount++;
			}
		}
		System.out.println("No. Of Vowel "+vCount);
		System.out.println("No.Of Consonent "+cCount);

	}

}
