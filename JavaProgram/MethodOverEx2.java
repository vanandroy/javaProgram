class MethodOverEx2
{
public static void main(String [] args)
{
mul();
mul(2);
mul(3,4);
mul(5,6,7);
}

public static void mul()
{
System.out.println("multiply method with zero argument");
System.out.println(20*2);
}
 
 public static void  mul(int a)
 {
System.out.println("multiply method with one argument");
System.out.println(a);
}
public static void  mul(int a,int b)
{
System.out.println("multiply method with two argument");
System.out.println(a*b);
}
public static void  mul(int a,int b,int c)
{
System.out.println("multiply method with three argument");
System.out.println(a*b*c);
}

}