import java.util.Scanner;


	class TestCustomException
	 {
		 static void validate(int num) throws CustomExceptionEx{
			 if(num>1000)
				 throw new CustomExceptionEx("number is not valid");
			 else
				 System.out.println("Correct");
		 }
	 

		 public static void main(String []args)
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter the number");
			 int n=sc.nextInt();
			 try
			 {
				
				 validate(n);
			 }
			 catch( CustomExceptionEx e)
			 {
				 System.out.println("caught the exception");
				 System.out.println("exception occured :"+e);	 
			 }
			 System.out.println("rest of the code");
		 }

		
		}

