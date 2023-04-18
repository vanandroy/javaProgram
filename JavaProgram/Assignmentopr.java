class Assignmentopr
{
public static void main(String []args)
{
int x=20;
int y=10;
System.out.println(x);
System.out.println(y);
x+=y;//means x=x+y;
System.out.println(x) ;//30
System.out.println(y) ;//10 because y is not updating;
x*=y;//means x*=y ;//x is 30 then 30*10 300 will be store in x
System.out.println(x) ;//300;
System.out.println(y) ;//10
}
}
