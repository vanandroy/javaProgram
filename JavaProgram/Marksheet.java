class Marksheet
{
public static void main(String [] args)
{
int mark=35;
if (mark>=90 && mark<=100)
{
System.out.println("Excellent");
}
else if (mark>=80 && mark<=89)
{
System.out.println("very good");
}
else if (mark>=70 && mark<=79)
{
System.out.println("good");
}
else if (mark>=60 && mark<=69)
{
System.out.println("above avg");
}
else if (mark>=50 && mark<=59)
{
System.out.println("average");
}
else if ( mark>=40 && mark<=49)
{
System.out.println("below avg");
}
else
{
System.out.println("Improve your self");
}
}
}