import java.util.Scanner;
public class MainDigit1 {
	
	
static int specialTwoDigitNumber(int x) {
	int x1=x/10;
	int x2=x%10;
	int sum=x1+x2+x1*x2;
	if(sum==x)
		System.out.println(x+"is a special number");
	else
		System.out.println(x+"is not a special number");
	
		
	return x;
	
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int r=specialTwoDigitNumber(n);

	}

}
