 
import java.util.Scanner;

class GetterSetter
{
private int pin;
long accountn;
String name;
private double balance;
Scanner s=new Scanner(System.in);

public long getAccountn()
{
return accountn;
}
public double getBalance()
{
return balance;
}
public int getPin()
{
return pin;
}
public void setPin()
{
System.out.println("enter your existing pin");
int pin=s.nextInt();
if 
(this.pin==pin)
{
System.out.println("enter new pin");

this.pin=s.nextInt();
System.out.println("Your pin has been reset");
}

else
 {
 System.out.println("wrong pin");
 }
 }
 
 public GetterSetter(int pin,long accountn,String name,double balance)
 {
 this.pin=pin;
 this.accountn=accountn;
 this.name=name;	
 this.balance=balance;
 }
 
}