//3.
import java.util.Scanner;
public class MainEvenOddSum {
	static boolean equalEvenOdd(int x)
	{
		int esum=0;
		int osum=0;
		do {
			int r=x%10;//345678
			if(r%2==0)
				esum=esum+r;
			else
				osum=osum+r;
			x=x/10;
		}
		while(x!=0);
		if(esum==osum)
			return true;
		else 
			return false;
	}
	
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  the integer value");
		int n=s.nextInt();
		boolean bg=equalEvenOdd(n);
		if(bg==true)
			System.out.println("PASS");
		else
			System.out.println("fail");
		
		
	}

}
