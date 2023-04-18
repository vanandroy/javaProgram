class MethodEx5
{
public static void main(String [] args)
{
int a=5;
int b=6;

mult(a,b);
}
public static void mult(int a,int b)
{
	int c=a*b;
System.out.println(a*b);
add(c);

}
public static void add(int c)
{
System.out.println(c+10);

}
}