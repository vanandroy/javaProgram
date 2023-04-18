import java.util.Scanner;
public class MainNoOfPrime {
	
	static int countPrimeDigit(int x) {
		int count=0;
		do {
			int y=x%10;
			if(y==1 || y==2 || y==3 || y==5 ||y==7)
				count++;
			x=x/10;
			
		}
		while (x!=0);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value : ");
		int n=sc.nextInt();
		int pm=countPrimeDigit(n);
		System.out.println("Prime Digit In "+n+"is :"+pm);
		

	}

}
