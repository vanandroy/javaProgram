//5
import java.util.Scanner;
public class MainCountPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=s.nextInt();
		int count=0,count1=0;
		
		while(n!=0)
		{	boolean k = isPrime(n);
		if(k==true)
			{//System.out.println(n+"is prime num");
		count++;
		}
		else
			{//System.out.println(n+"is not a prime num");
			count1++;
			}
		n--;
		}
		System.out.println(count);
		//System.out.println(count1+":nu of not a prime number");
}
	static boolean isPrime(int x) 
	{
		for (int i=2;i<=x/2;i++) 
		{	if(x%i==0)
		return false;
			}
			return true;
	}

}
