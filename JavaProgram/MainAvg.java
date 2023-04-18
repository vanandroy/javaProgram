import java.util.Scanner;
public class MainAvg {

static double averageOfDigit(int x)
{
	double sum=0;
	int count=0;
	
	
	do {
		int r=x%10;
		sum=sum+r;
		x=x/10;
		count++;

		
			
	}
	while(x!=0);
	
	 return sum/count;

	}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();
		double av=averageOfDigit(n);
		System.out.println("Average Of Digit Of "+n+" is "+av);

	}

}
