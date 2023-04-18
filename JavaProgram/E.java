abstract class Mirr
{
String loc;
int id;

public Mirr(String loc,int id)
{
this.id=id;
}
abstract void main();
public void zafar()
{
	System.out.println("location is :"+loc);
}
}
class B extends Mirr
{
String name;
String place;
public B(String loc,int id,String name,String place)
{
super(loc,id);
this.name=name;
this.place=place;
}
void main()
{
System.out.println("ok");
System.out.println("id is: "+id);
System.out.println("name is: "+name);
System.out.println("place is: "+place);
}}

class E
{
public static void main(String [] args)
{
B b=new B("delhi",101,"vk","patna");
b.main();
//super.zafar();
}
}