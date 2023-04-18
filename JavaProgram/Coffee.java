class CoffeeVending
{ String place;
public CoffeeVending(String place)
{
	this.place=place;

}
public void greet()
{
System.out.println("welcome in our coffee house");
System.out.println("place of coffee shop :"+place);
}
}

class Latte extends CoffeeVending
{
String taste;
int pricepercup;

public Latte(String place,String taste,int pricepercup)
{
super(place);
this.taste=taste;
this.pricepercup=pricepercup;
}
public void greet()
{
	System.out.println("place of coffee shop :"+place);
System.out.println("taste of latte :"+taste);
System.out.println("price of latte per cup :"+pricepercup);
}
public void ingedients()
{
System.out.println("WELCOME IN OUR COFEE SHOP");
}
}
class Espresso extends CoffeeVending
{
String taste;
int pricepercup;

public Espresso(String place,String taste,int pricepercup)
{
super(place);
this.taste=taste;
this.pricepercup=pricepercup;
}
public void greet()
{
	System.out.println("place of coffee shop :"+place);
System.out.println("taste of Espresso :"+taste);
System.out.println("price of Espresso per cup :"+pricepercup);
}
public void ingedients()
{
System.out.println("WELCOME IN OUR COFFEE SHOP");
}
}
class Coffee
{
public static void main(String [] args)	
{
CoffeeVending c=new Latte("delhi","delicious",40);
c.greet();
Latte l=(Latte)c;
l.ingedients();

CoffeeVending d=new Espresso("patna","delicious",30);
d.greet();
Espresso e=(Espresso)d;
e.ingedients();

}
}