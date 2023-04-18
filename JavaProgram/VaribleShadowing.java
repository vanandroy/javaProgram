class VaribleShadowing
{
int a=250;
static float c=50.2f;
void display()
{
int a=30;
int c=120;
System.out.println(a);//30
System.out.println(c);//120
System.out.println(this.a);//250
System.out.println(this.c);//120
System.out.println(VaribleShadowing.c);//50.2
}
void print()
{
System.out.println(a);//250
System.out.println(c);//50.2
System.out.println(VaribleShadowing.c);//50.2
}
static void data()
{
int a=10;//local a
int c=20;//local c
System.out.println(a);//10
System.out.println(c);//20
System.out.println(VaribleShadowing.c);//50.2
VaribleShadowing v=new VaribleShadowing();
System.out.println(v.a);//250
}

public static void main(String [] args)
{
VaribleShadowing ob=new VaribleShadowing();
ob.display();
ob.print();
data();

}
}