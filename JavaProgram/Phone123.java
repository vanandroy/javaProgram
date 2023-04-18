class Phone123 extends Gadget123
{
	String model;
	String colour;
	String camcap;

	public Phone123(String brand,double price,String model,String colour,String camcap)
	{
		//super();
		super(brand,price);
		//this.brand=brand;
		//this.price=price;
		this.model=model;
		this.colour=colour;
		this.camcap=camcap;

	}
	public Phone123(String brand,double price,String model)
	{
		super(brand,price);
		this.model=model;
	}

	public void displayPhone()

	{

		displayGadget();
		System.out.println("Model Of Mobile :" +model);
		System.out.println("Colour Of Mobile :" +colour);
		System.out.println("Camera Capacity Of Mobile :"+ camcap);
	}
}