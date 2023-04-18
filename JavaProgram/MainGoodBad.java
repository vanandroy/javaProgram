//5.
import java.util.Scanner;
public class MainGoodBad {
	static boolean equalEvenOdd(int x)
	{
		int ecount=0;
		int ocount=0;
		do {
			int r=x%10;//345678
			if(r%2==0)
				ecount++;
			else
				ocount++;
			x=x/10;
		}
		while(x!=0);
		if(ecount==ocount)
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
			System.out.println("GOOD");
		else
			System.out.println("BAD");
		
		
	}

}

