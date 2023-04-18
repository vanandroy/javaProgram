package Number;

class Swap12
{

	public static void main(String []args){

		int a=10;
		int b=20;
		System.out.println("Before Swapping a ="+a);
		System.out.println("Before Swapping b ="+b);

		int c;
		/*
//logic 1
    c=a;
    a=b;
    b=c; 
//logic 2
c=a+b;
a=c-a;
b=c-a; 
//logic 3
c=a+b;
b=c-b;
a=c-b;*/
		//logic 4
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After Swapping a ="+a);
		System.out.println("After Swapping b ="+b);

	}
}