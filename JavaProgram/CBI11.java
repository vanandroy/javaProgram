import java.util.Scanner;

interface ATM11
{
	public void withdraw();
	public void changepin();
	public void printStatement();
}



abstract class RBI12
{
	public void guideLines()
	{
		System.out.println("Reserve Bank Of India");
	}
	abstract void printLoanInterestRate();
}


class CBI11 extends RBI12 implements ATM11
{
	long accno;
	int pin;
	double bal;
	Scanner sc=new Scanner(System.in);

	public CBI11(long accno,int pin,double bal)
	{
		this.accno=accno;
		this.pin=pin;
		this.bal=bal;
	}
	public void withdraw()
	{
		System.out.println("welcome in CBI11 Bank");
	}
	public void changepin()
	{
		System.out.println("enter your pin for verification");
		int p=sc.nextInt();
		if(p==pin)
		{
			System.out.println("enter your new pin");
			int pin=sc.nextInt();
			System.out.println("your pin is updated sucessfully");
		}
		else
		{
			System.out.println("you have entered wrong pin");
		}
	}
	public void printStatement()
	{
		System.out.println("enter your pin for verification");
		int p=sc.nextInt();
		if(p==pin)
		{
			System.out.println(accno+" "+bal);
		}
		else
		{
			System.out.println("you have entered wrong pin");
		}	
	}

	public void printLoanInterestRate()
	{
		System.out.println("enter your pin for verification");
		int p=sc.nextInt();
		if(p==pin)
		{
			System.out.println("Loan Interest Rate : 7%");
		}
		else
		{
			System.out.println("you have entered wrong pin");
		}	

	}
	public static void main(String [] args)
	{
		CBI11 s=new CBI11(9876543298l,234,23409.98d);
		s.guideLines();
		s.withdraw();
		s.changepin();
		s.printStatement();
		s.printLoanInterestRate();
	}
}
