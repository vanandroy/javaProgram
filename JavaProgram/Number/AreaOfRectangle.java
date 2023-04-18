package Number;

import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		double perimeter=2*(l+b);
		double area=l*b;
		System.out.println("Area of rectangle :"+area);
		System.out.println("Perimeter of rectangle :"+perimeter);
		
	}
}