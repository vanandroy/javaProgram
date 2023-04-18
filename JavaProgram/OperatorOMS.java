class Ola1
{
	String name;

	public Ola1(String name)
	{
		this.name=name;
	}
	void verify()
	{
		System.out.println("Name of the customer :"+name);
	}
	void welcome()
	{
		System.out.println("WELCOME IN OUR CAB");
	}
}
class Mini1 extends Ola1
{
	long phonen;
	String source;
	String dest;
	int price;

	public Mini1(String name,long phonen,String source,String dest,int price)
	{
		super(name);
		this.phonen=phonen;
		this.source=source;
		this.dest=dest;
		this.price=price;

	}
	void verify()
	{
		System.out.println("phone no of customer :"+phonen);
		System.out.println("source place of your journey :"+source);
		System.out.println("destination of your journey :"+dest);
	}
	void displayfare()
	{
		System.out.println("Name of the customer :"+name);
		System.out.println("destination of your journey :"+dest);
		System.out.println("Fare per km :"+price);
	}}
class Sedan12 extends Ola1
{
	long phonen;
	String source;
	String dest;
	int price;
	public Sedan12(String name,long phonen,String source,String dest,int price)
	{
		super(name);
		this.phonen=phonen;
		this.source=source;
		this.dest=dest;
		this.price=price;
	}
	void verify()
	{
		System.out.println("Name of the customer :"+name);
		System.out.println("phone no of customer:"+phonen);

	}
	void displaycost()
	{
		System.out.println("Fare per km :"+price);
	}
}
class OperatorOMS
{
	public static void main(String [] args)
	{
		Ola1 o=new Ola1("OLA");
		o.verify();
		o.welcome();

		Mini1 m=new Mini1("tfs",7896547896l,"BTM","AIRPORT",456);
		m.verify();
		m.welcome();
		m.displayfare();

		Sedan12 s=new Sedan12("uber",7896000002l,"PATNA","DANAPUR",550);
		s.verify();
		s.welcome();
		s.displaycost(); 

		Ola1 w=new Mini1("htm",7896547896l,"TM","AIRPOR",56);
		w.verify();

		Mini1 n=(Mini1)w;
		n.verify(); 

		Ola1 f=new Sedan12("uber",7896000002l,"PATNA","DANAPUR",550);
		f.verify();

		Sedan12 j=(Sedan12)f;
		j.verify();
	}
}