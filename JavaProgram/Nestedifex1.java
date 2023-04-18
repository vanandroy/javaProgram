class Nestedifex1
{
public static void main(String [] args)
{
int number = 24;
if(number%2==0)
{
System.out.println("the given no.is even");
    if(number%3==0)
 {
 System.out.println("the given no.is divisible by 3");
 System.out.println(number+2);
}
else
{
  System.out.println("the given no.is even but not divisible by3");
  }
  
}    // inner if block ends here
else
{
System.out.println("the given no. is odd number");
}   // outer if block is end here
}
}