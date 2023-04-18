import java.util.Scanner;
public class MainSumOfPerfect {
	static boolean sumOfPerfect(int x)
	{
		int sum=0,temp=x;
		for (int i=1;i<=x/2;i++)
		{
			if(x/i==0)
			{
				sum=sum+i;
			}
		}
System.out.println(sum);
	if(sum==temp)
		return true;
	else
		return false;
			
		}

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
System.out.println("enter the integer value");
int n=s.nextInt();

while(n!=0)
{
	boolean k = sumOfPerfect(n);
	if(k== true)
		System.out.println(n+":is perfect num");
	else
		System.out.println(n+":is not a perfect");	
	n--;
}
}

}
