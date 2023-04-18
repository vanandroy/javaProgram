import java.util.Scanner;
public class MainDigit {
	 static int count=0;


	static int divisor(int x) {
		 for(int i=1;i<=x/2;i++)
			 if(x%i==0)
			 
			count++;
			 
			
			System.out.println("no of factor of "+x+" is "+count);
	
		
		return x;
		}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter the number :");
 int n=sc.nextInt();
int r=divisor(n);

	}


}
