class Gadget
{
String brand;
double price;

public Gadget(String brand,double price)
{
	this.brand=brand;
	this.price=price;

}

public void displayGadget()
{
System.out.println("Brand Name of Phone:"+ brand);
System.out.println("Price Name of Phone:"+ price);
//System.out.println("Reduced Price Of Phone :"+ (price-1000));
}
}
class Phone extends Gadget123
{
String model;
String colour;
String camcap;

public Phone(String brand,double price,String model,String colour,String camcap)
{
	//super();
super(brand,price);
//this.brand=brand;
//this.price=price;
this.model=model;
this.colour=colour;
this.camcap=camcap;

} 
public Phone(String brand,double price,String model)
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

public class Assignment
{
public static void main(String [] args)
{
Phone123 p=new Phone123("Realme",30000d,"M01","Brown","12MP");
Phone123 r=new Phone123("oppo",20000d,"op01");
Gadget123 g=new Gadget123("Apple",100000d);
p.displayPhone();
r.displayPhone();
g.displayGadget();
}
}