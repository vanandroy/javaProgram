// wjp to create a MobileP class variables are price,brand,color
//add mobeP object into ArrayList and sort Brand AND price
public class MobileP implements Comparable<MobileP> {
	double price;  
	String brand;
	String color;
	public MobileP(double price,String brand,String color)
	{
		this.price=price;
		this.brand=brand;
		this.color=color;
	}
public String toString()
{
	return price+" "+brand+" "+color;
}
public int compareTo(MobileP m)
{
	if(this.price>m.price)
		return 1;
	else if(this.price<m.price)
		return -1;
	else
		return 0;
	
}
}
