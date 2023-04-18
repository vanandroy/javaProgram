class Gadget123
{
	String brand;
	double price;

	public Gadget123(String brand,double price)
	{
		this.brand=brand;
		this.price=price;

	}

	public void displayGadget()
	{
		System.out.println("Brand Name of Phone:"+ brand);
		System.out.println("Price Name of Phone:"+ price);
		System.out.println("Reduced Price Of Phone :"+(price-1000));
	}
}