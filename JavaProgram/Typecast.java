class Typecast
{int v=20;
char c='A';
float value=v;
int n=66;
int d=(char)n;
void view()

{
System.out.println(d);//B will be printed,bcoz 66 is ascii value of B
System.out.println(value);//65 will be printed bxoz A is alphabet for ascii 65
}
public static void main(String [] args)
{
Typecast t=new Typecast();
t.view();

}
}