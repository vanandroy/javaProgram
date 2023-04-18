import java.util.Scanner;
public class MainSmallest {


    static int b;
	static int c;
	static int a;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
				int small=smallest(a,b,c);
				System.out.println(small+"is biggest");
	}
static int smallest(int a, int b, int c) {
		
		int small=a;
		if(b<small)
			small=b;
		if
		(c<small)
			small=c;
		
			
		return small; 
		
		
	}

}
