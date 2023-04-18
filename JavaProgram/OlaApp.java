import java.util.Scanner;
class Ola
{
public void welcome()
{
System.out.println("Welcome to Ola");
}
public void verify()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the contact number");
long phonno=s.nextLong();
}}
class Mini extends Ola
{
static int costperkm=120;
public void verify()
{
Scanner s=new Scanner(System.in);
super.verify();
System.out.println("enter contact number");
long phonno=s.nextLong();
System.out.println("enter source");
String sc=s.next();
System.out.println("enter destination");
String destination=s.next();
}
public void displayCost()
{
System.out.println("total cost is"+costperkm*10);
}


}
class Sedan extends Ola
{
static int costperkm=120;
public void verify()
{
Scanner s=new Scanner(System.in);
super.verify();
System.out.println("enter contact number");
long phonno=s.nextLong();
System.out.println("enter source");
String sc=s.next();
System.out.println("enter destination");
String destination=s.next();
}
public void displayFare()
{
System.out.println("total cost is"+costperkm*10);
}


}
/*class OlaApp
{
public static void main(String [] args)
{
Ola obj=new Sedan();
obj.welcome();
obj.verify();
//obj.displayFare();
Sedan s1=(Sedan)obj;
s1.displayFare();
}} */
class OlaApp
{
public static void main(String [] args)	
{
	System.out.println("enter your choice 1 Sedan 2:Mini");
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	switch(option)
	{
		case 1:
		{
			Ola obj=new Sedan();
		obj.welcome();
		obj.verify();
		Sedan s=(Sedan)obj;
		s.displayFare();
		break;
	}
	case 2:
	{
		Ola obj2=new Mini();
		obj2.welcome();
		obj2.verify();
		Mini m=(Mini)obj2;
		m.displayCost();
		break;	
	}
	
	}
	
}

}