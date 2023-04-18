import java.util.Scanner;

class CellPhone
{
	String brand;
	double price;

	public CellPhone(String brand,double price)
	{
		this.brand=brand;
		this.price=price;

	}


	public void displayGadget()
	{
		System.out.println("Brand Name of Phone:"+ brand);
		System.out.println("Price Name of Phone:"+ price);
	}
}
class Phone12 extends CellPhone
{
	String model;
	String colour;
	String camcap;

	public Phone12(String brand,double price,String model,String colour,String camcap)
	{
		//super();
		super(brand,price);
		//this.brand=brand;
		//this.price=price;
		this.model=model;
		this.colour=colour;
		this.camcap=camcap;

	} 
	public Phone12(String brand,double price,String model)
	{
		//super(brand,price);
		//this.model=model;
		this(brand,price,model,null,null); 
	}

	public void displayPhone()

	{

		displayGadget();
		System.out.println("Model Of Mobile :" +model);
		System.out.println("Colour Of Mobile :" +colour);
		System.out.println("Camera Capacity Of Mobile :"+ camcap);
	}
}

public class Knockout
{
	public static void main(String [] args)

	{
		Scanner sc=new Scanner(System.in);
		Phone12 p=new Phone12("Realme",30000d,"M01","Brown","12MP");
		Phone12 r=new Phone12("oppo",20000d,"op01");
		CellPhone g=new CellPhone("Apple",100000d);
	/*	String brand=sc.nextLine();
		double price=sc.nextDouble();
		String model=sc.nextLine();
		String colour=sc.nextLine();
		String camcap=sc.nextLine();
		*/
		p.displayPhone();
		r.displayPhone();
		g.displayGadget();
	}
}