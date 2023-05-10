package String;

public class Swap1stAndLastWordInGivenString {
	public static void main(String[] args) {
		String s="I Am A Software Engineer";//Engineer Am A Software I
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}
		System.out.println();
		//st[0]=I,st[1]=Am,st[2]=Software,st[3]=Engineer
//		int a=10;
//		int b=20;
//		int temp=a;
//		a=b;
//		b=temp;
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}
	}

}
