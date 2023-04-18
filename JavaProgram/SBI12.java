import java.util.Scanner;
public class SBI12

{
	long acc;
	double bal;
	int pin;
	
	public SBI12(long acc,double bal,int pin)
	{
		this.acc=acc;
		this.bal=bal;
		this.pin=pin;
		
	}
	public void withdrawMoney() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your pin");
		int p=s.nextInt();
		try { 
			if(pin==p)
		
		{
			System.out.println("enter the amount U want to withdraw");
			double amt=s.nextDouble();
			if(amt<=bal)
			{
				bal=(int) (bal-amt);
				System.out.println("collect your cash");
			}
			
		
		}
		
		else
		{
			//throw new InvalidPin("wrong pin");
			throw  new LowBalanceException("lowbalance");
		}
		}
		/*catch(InvalidPin e1)
		{
			System.out.println(e1.getMessage());
		}
		*/
		catch(LowBalanceException e2)
		{
			System.out.println(e2.getMessage());
		}
		
	}
	public void sample()
	{
		System.out.println("hello");
	}
class LowBalanceException extends RuntimeException
{
	public LowBalanceException(String m)
	{
		super(m);
	}
}
	
	public static void main(String[] args) {
		SBI12 s=new SBI12(789654123l,100000.092d,1234);
	s.withdrawMoney();
		s.sample();

	}

}
