/*1.create an array of integer values 
print only even numbers
2.create an array of integer final sum of array elements and print the sum.
3. create an array of string print using loop */

class ArrayEven
{
public static void main(String [] args)
{
	//int num[]={90,23,24,70,80,100,127,45,51};
	
int num[]=new int[8];
 num[0]=12;
num[1]=10;
num[2]=45;
num[3]=23;
num[4]=25;
num[5]=65;
num[6]=64;
num[7]=68; 

System.out.println("only even number in the array");
for(int i=0;i<num.length;i++)
{
if(num[i]%2==0)
{
System.out.println(num[i]);
} // if ends
} // for end
} //main end
} //class end