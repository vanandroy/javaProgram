//3.
import java.util.Scanner;
public class MainEvenOddCount {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the integer value");
	int n=s.nextInt();
	
	int count=0;
	int count1=0;
	for( int i=1;i<=n;i++)
	{
		if(i%2==0)
			count++;
		else
			count1++;
	}

	System.out.println("even count :"+count);
	System.out.println("odd count :"+count1);
	}

}
