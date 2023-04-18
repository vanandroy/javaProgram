// 2. create an array of integer final sum of array elements and print the sum 
class ArrayFinal
{
public static void main(String [] args)
{
	//int num[]={10,20,30,40,500,100};
	
int num[]=new int[6];
num[0]=05;
num[1]=10;
num[2]=20;
num[3]=50;
num[4]=30;
num[5]=40; 

int sum=0;
System.out.println("sum of integer ");
/* for(int i=0;i<num.length;i++) //for loop
{
sum=sum+num[i];
}
 */
for (int i:num) //for each loop
{
	sum=sum+i;
}
System.out.println(sum);
}
}