import java.util.Scanner;
public class MainPrime {

	static boolean isPrimeNumber(int x) {
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int n=sc.nextInt();
		boolean rs=isPrimeNumber(n);
		if(rs==true)
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is Not a Prime Number");
	}
		

		
	}


