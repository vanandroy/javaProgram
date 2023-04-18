import java.util.Scanner;
public class MainDigit3 {
 static int sumOfDigits(int x)
 {
	 int sum=0;
	 do {
		 int r=x%10;
		 sum=sum+r;
		 x=x/10;
	 }
	 while(x!=0);
	 return sum;
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value Of n :");
		int n=sc.nextInt();
		int sm=sumOfDigits(n);
		System.out.println("Number Of Digit Is : "+sm);
	}

}
