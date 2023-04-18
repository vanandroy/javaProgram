package Oops;

public class Rectangle extends Square
{
	int z;
	public Rectangle(int x,int z) {
		super(x);
		this.z=z;
	}
	void areaOfRectangle() {
		System.out.println("Area Of Rectangle is :"+x*z);
	}

	
	

}