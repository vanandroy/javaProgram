// 2. create an array of integer final sum of array elements and print the sum 
class ArraySum
{
public static void main(String [] args)
{
	float a[]={10.5f,20.7f,30.6f,40.8f,500.8f,100.9f};
	
/* float a[]=new int[6];
a[0]=05;
a[1]=10;
a[2]=20;
a[3]=50;
a[4]=30;
a[5]=40; */

float sum=0;
System.out.println("sum of float ");
/* for(float i=0;i<a.length;i++) //for loop
{
sum=sum+a[i];
}
 */
for (float i:a) //for each loop
{
	sum=sum+i;
}
System.out.println(sum);
}
}