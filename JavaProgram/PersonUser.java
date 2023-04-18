
public class PersonUser {
String name;
int age;
long phoneno;
public PersonUser(String name,int age,long phoneno)
{
	this.name=name;
	this.age=age;
	this.phoneno=phoneno;	
}
void person()
{
	System.out.println("Name of User :"+name);
	System.out.println("Age of User :"+age);
	System.out.println("Phone Number of User :"+phoneno);
}

}
class TYEmployee12 extends PersonUser
{
	static String company="TYSS";
	String designation;
	
	public TYEmployee12(String name,int age,long phoneno,String designation)
	{
		super(name,age,phoneno);
		this.designation=designation;
		}
	void Employee()
	{
		System.out.println("Company name :"+company);
		System.out.println(" Designation of Employee:"+designation);
	}
}

class QSPEmployee extends TYEmployee12
{
String branch;
double salary;
int hiredate;

public QSPEmployee(String name, int age, long phoneno, String designation,String branch,double salary,int hiredate)
{
		super(name, age, phoneno, designation);
		this.branch=branch;
		this.salary=salary;
		this.hiredate=hiredate;
		
	}
void QSPEmp()
{
	System.out.println("Branch Name Of Employee :"+branch);	
	System.out.println("Salary Of Employee :"+salary);	
	System.out.println("Hiredate Of Employee :"+hiredate);	
}
	
}

