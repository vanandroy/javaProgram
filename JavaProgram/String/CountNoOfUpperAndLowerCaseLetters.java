package String;

public class CountNoOfUpperAndLowerCaseLetters {
	public static void main(String[] args) {
		String s="SofTware";
		int uppercase=0;
		int lowercase=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				lowercase++;
			}else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
				uppercase++;
			}
		}
		System.out.println("UPPERCASE LETTERS ARE :"+uppercase);
		System.out.println("LOWERCASE LETTERS ARE :"+lowercase);
		
	}
}
