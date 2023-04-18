class K
{
int p;
public K(int p)
{
	this.p=p;
}
void printK()
{
System.out.println("this method is from K class ");
System.out.println(p+20);

}
}

class J extends K
{
int q;
public J(int p,int q)
{
	super(p);
	this.q=q;
}
void printJ()
{
System.out.println("this method is from J class ");
System.out.println(q+10);
}
}

class N extends J
{
int r;
public N(int p,int q,int r)
{
	super(p,q);
	this.r=r;
}
void printN()
{
System.out.println("this method is from N class ");
System.out.println(r+40);
}
}
class ExecutesKJN
{
public static void main(String [] args)
{
N n=new N(2,5,6);
n.printN();
n.printJ();
n.printK();

J e=new J(30,20);

e.printK();
e.printJ();

K f=new K(24);

f.printK();
}
}