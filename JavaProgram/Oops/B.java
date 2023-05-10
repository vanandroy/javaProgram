package Oops;

public class B extends A {
	public void test() 
	{
		System.out.println("test2");
	}
	public void test1() 
	{
		System.out.println("test2");
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.test();
		obj.test1();
	}
}
