class Open
{
	public static void main(String [] args)
	{
		int number=20;
		int result=(number<25)? number+1: number-1;
		System.out.println(result);

		// example2
		int age =25;
		String s= (age>=18)?"eligible for voting":"Not eligible for voting";
		System.out.println(s);


		// emample3
		int number1 =100;
		char result1=(number>90)?'y':'N';
		System.out.println(result);


		// example3
		int a=12;
		int b=10;
		int c=(a!=b)?a+b:a*b;
		System.out.println(c);

	}
}