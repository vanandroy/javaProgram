abstract class Card
{
	long accno;
	long cardno;
	int cvv;
	public Card(long accno,long cardno,int cvv)
	{
		this.accno=accno;
		this.cardno=cardno;
		this.cvv=cvv;
	}

	abstract void cardDetail();

	void display()
	{
		System.out.print("thank you for visiting in sbi");
	}
}

class  DebitCard extends Card
{
	double balance;
	public DebitCard(long accno,long cardno,int cvv,double balance)
	{
		super(accno,cardno,cvv);
		this.balance=balance;
	}
	void cardDetail()
	{
		System.out.println("card is valid");
	}
	void displayDebit()
	{
		System.out.println(" debit card is valid");
	}
}

class  CreditCard extends Card
{
	double limit;
	public CreditCard(long accno,long cardno,int cvv,double limit)
	{
		super(accno,cardno,cvv);
		this.limit=limit;
	}
	void cardDetail()
	{
		System.out.println("card is valid");
	}
	void displayCredit()
	{
		System.out.println(" credit card is valid");
	}
}

class CardDetail
{
	public static void main(String [] args)
	{
		DebitCard d=new DebitCard(676555622l,12345678910l,345,113545d);
		d.cardDetail();
		d.displayDebit();
		CreditCard c=new CreditCard(78909665l,192832727l,654,678878d);
		c.cardDetail();
		c.displayCredit();

		Card h=new DebitCard(78909665l,192832727l,654,678878d);
		h.cardDetail();

		DebitCard g=(DebitCard)h;
		g.displayDebit();

		/*Card v=new CreditCard(789000665l,1920002727l,604,67008d);
v.cardDetail();
CreditCard y=(CreditCard)v;
y.displayCebit();*/
	}}