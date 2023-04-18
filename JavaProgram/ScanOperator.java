
import java.util.Scanner;

class Scanner2
{
	private int pin;
	long accountn;
	String name;
	private double balance;
	
	public long getAccountn()
	{
		return accountn;
	}
	/*public double getBalance()
{
return balance;
}*/
	public int getPin()
	{
		return pin;
	}
	public void setPin( int pin)
	{
		this.pin=pin;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your existing pin");
		int pin1=s.nextInt();

		if(this.pin==pin)
		{
			System.out.println("enter new pin");

			this.pin=s.nextInt();
			System.out.println("Your pin has been reset");
		}

		else
		{
			System.out.println("wrong pin");
		}
	}

	public Scanner2(int pin,long accountn,String name,double balance)
	{
		this.pin=pin;
		this.accountn=accountn;
		this.name=name;	
		this.balance=balance;
	}

}
class ScanOperator
{
	public static void main(String [] args)
	{
		Scanner2 s1=new Scanner2(413,999999999999l,"land",278.677d);
	}
}