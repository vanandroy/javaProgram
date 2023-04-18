class Vehicle
{
	String bname;
	int mno;
	String type;

	public Vehicle(String bname,int mno,String type)
	{
		this.bname=bname;
		this.mno=mno;
		this.type=type;
	}
	void display()
	{
		System.out.println("Brand name of Vehicle :"+ bname);
		System.out.println("Model number of Vehicle :"+ mno);
		System.out.println("Vehicle type :"+ type);
	}
}
class Kar extends Vehicle
{
	String cname;
	double price;
	String colour;

	public Kar(String bname,int mno,String type,String cname,double price,String colour)
	{
		super(bname,mno,type);
		this.cname=cname;
		this.price=price;
		this.colour=colour;
	} 

	void view()
	{
		System.out.println("Brand name of Car :"+ cname);
		System.out.println("Price of Car :"+ price);
		System.out.println("Colour of Car :"+ colour);
	}
}

class Jeep extends Vehicle
{
	String brand;
	double price;
	String colour;

	public Jeep(String bname,int mno,String type,String brand,double price,String colour)
	{
		super(bname,mno,type);
		this.brand=brand;
		this.price=price;
		this.colour=colour;
	}
	void details()
	{
		System.out.println("Brand name of Jeep :"+ brand);
		System.out.println("Price of Jeep :"+ price);
		System.out.println("Colour of Jeep :"+ colour);
	}
}

class Run
{
	public static void main(String [] args)
	{
		Vehicle v=new Vehicle("BMW",012,"petrol");
		v.display();
		Kar c=new Kar("SCORPIO",102,"white","rigo",290292d,"brown");
		c.view();
		c.display();
		Jeep j=new Jeep("AUDI",013,"petrol","TATA",290202d,"red");
		j.details();
		j.display();
	}
}