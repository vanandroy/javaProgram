package String;

public class StringPalindrome {
	public static void main(String[] args) {
		String s="rar";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(s))
		{
			System.out.println("its a palindrome");
		}else
		{
			System.out.println("its not a palindrome");
		}
	}
}
