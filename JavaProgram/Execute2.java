class Baccount
{
	long accno;
	long contact;

	public Baccount(long accno,long contact)
	{
		this.accno=accno;
		this.contact=contact;
	}
	void account()
	{
		System.out.println("Bank account no is :" +accno);
		System.out.println("Contact no is :" +contact);
	}
}

class kard extends Baccount
{
	int pin;

	public kard(long accno,long contact,int pin)
	{
		super(accno,contact);
		this.pin=pin;
	}
	void view()
	{
		System.out.println("Pin of card is :" +pin);
	}
}

class Creditkard extends kard
{
	double limit;

	public Creditkard(long accno,long contact,int pin,double limit)
	{
		super(accno,contact,pin);
		this.limit=limit;
	}
	void credit()
	{
		System.out.println("Limit of credit card is :" +limit);
	}
}

class Execute2
{
	public static void main(String [] args)
	{
		Creditkard c=new Creditkard(123654789l,789654123l,456,789654d);
		c.credit();
		c.view();
		c.account();

		kard c1=new kard(7896548523l,4569871230l,123);
		c1.view();
		c1.account();

		Baccount b=new Baccount(7847896540l,1254635487l);
		b.account();
	}
}