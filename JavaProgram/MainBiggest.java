import java.util.Scanner;
public class MainBiggest {


    static int b;
	static int c;
	static int a;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
				int big=biggest(a,b,c);
				System.out.println(big+"is biggest");
	}
static int biggest(int a, int b, int c) {
		
		int big=a;
		if(b>big)
			big=b;
		if
		(c>big)
			big=c;
		
			
		return big; 
		
		
	}

}
