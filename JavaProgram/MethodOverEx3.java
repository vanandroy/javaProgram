/* WJP TO OVERLOAD A STATIC METHOD 
 PRINT()
 WITHOUT ARGUMENT and print "nothing"
 WITH ONE FLOAT ARGUMENT AND PRINT IT
 WITH TWO float ARGUMENT add values and print
 add one string one float arg and print it
 with two string arg and print it */
 
 class MethodOverEx3
 {
public static void main(String [] args)
 {
 print();
 print(12f);
print(13f,14f);
 print("apple",178f);
 print("Mango","Mina");
 }
 public static void print()
 {
 System.out.println("Nothing");
 }
  public static void print(float a)
  {
  System.out.println(a);
  }
  public static void print(float a,float b)
  {
  System.out.println(a+b);
  }
 
public static void print(String a,float b) 
 {
 System.out.println(a + "and " + b);
 }
 public static void print(String a,String b)
{
System.out.println(a + "and" + b);
} 
} 
  
 
 
