class Getter
{
public static void main(String [] args)
{
GetterSetter gs=new GetterSetter(123,123456789l,"raju",500000d);
System.out.println(" pin is" + gs.getPin());
gs.setPin();
double bal=gs.getBalance();
if
(bal==0.0)
{
System.out.println("try again by entering correct pin");	
}
else
{
	System.out.println(" your existing balance is  "+gs.getBalance());
}

}
}