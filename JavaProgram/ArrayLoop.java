//2.1 create an array of integer final subtract of array elements and print the subtract 
class ArrayLoop
{
public static void main(String [] args)
{
int a[]={21,23,24,25,10};
int sub=0;
for( int i=0;i<a.length;i++)
{
	sub=sub-a[i];
}
System.out.println(sub);	
}
}