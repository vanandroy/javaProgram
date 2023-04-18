abstract class RBI
{
abstract void homeIntrestRate();
void printGuideline()
{
System.out.println("Mannual of rbi");
}
}
class SBI extends RBI
{
void homeIntrestRate()
{
System.out.println("You can get 8% ");
}
void greet()
{
	System.out.println("Welcome  in SBI");
}
}
class Abc
{
public static void main(String [] args)
{
SBI s=new SBI();
s.homeIntrestRate();

RBI r=new SBI();
r.printGuideline();
r.homeIntrestRate();
SBI b=(SBI)r;
b.greet();
}
}