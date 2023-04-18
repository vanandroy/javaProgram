import java.util.Scanner;
class CBI extends RBI1 implements ATM
{
	long acno;
	int pin;
	double balance;
	Scanner sc=new Scanner(System.in);

	public CBI(long acno,int pin,double balance)
	{
		this.acno=acno;
		this.pin=pin;
		this.balance=balance;
	}
	public void withdrawMoney()
	{
		System.out.println("enter your pin for verification");
		int p=sc.nextInt();
		if(p==pin)
		{
			System.out.println("Enter the amount ");
			double amount=sc.nextDouble();
			balance=balance-amount;  //debitting from existing balance
			System.out.println("Collect your cash");
		}
		else
		{
			System.out.println("You have entered wrong pin");
		}
	}//method ends here

	public void changePin()
	{
		System.out.println("enter your existing  pin for verification");
		int p=sc.nextInt();
		if(p==pin)
		{
			System.out.println("enter your new  pin ");
			pin=sc.nextInt();
			System.out.println("Your pin has been updated successfully");
		}
		else
		{
			System.out.println("You have entered wrong pin");
		}
	}//method ends
	public void printStmt()
	{
		System.out.println("enter your existing  pin for verification");
		int p=sc.nextInt();
		if(p==pin)
		{
			System.out.println(acno+"   "+balance);
		}
		else
		{
			System.out.println("You have entered wrong pin");
		}
	}//method ends 
	public void  printInterestRate()
	{
		System.out.println("Home Loan Interest rate is 6.9%");
		System.out.println("Vehicle  Loan Interest rate is 7 .7%");
		System.out.println("Gold   Loan Interest rate is 9 .7%");
	}

}   //CBI class ends here



