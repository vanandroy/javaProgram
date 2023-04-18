class Man
{
	String name;
	int age;
	long phoneno;

	public Man(String name,int age,long phoneno)
	{
		this.name=name;
		this.age=age;
		this.phoneno=phoneno;
	}
	void detailperson()
	{
		System.out.println("Name of the person :"+name);
		System.out.println("Age of the person :"+age);
		System.out.println("Phone number of the person :"+phoneno);
	}
}

class TYEmployee extends Man
{
	static String company="TYSS";
	String designation;
	double salary;
	int eid;
	public TYEmployee(String name,int age,long phoneno,String designation,double salary,int eid)
	{
		super(name,age,phoneno);
		this.designation=designation;
		this.salary=salary;
		this.eid=eid;
	}
	void profile()
	{
		System.out.println("designation of the employee :"+designation);
		System.out.println("Salary of the employee :"+salary);
		System.out.println("employee id of the employee :"+eid);
		System.out.println("compnay name of the employee :"+company);
	}
}
class QSEmplyoee extends TYEmployee
{
	String branch;
	String hire;
	public QSEmplyoee(String name,int age,long phoneno,String designation,double salary,int eid,String branch,String hire)
	{
		super(name,age,phoneno,designation,salary,eid);
		this.branch=branch;
		this.hire=hire;
	} 
	void qprofile()
	{
		System.out.println("Branch name of the employee :"+branch);
		System.out.println("Hire month of the employee :"+hire);

	}
	void salaryhike()
	{
		System.out.println("Salary hike of the employee :"+(salary+1000));
	}

}

class Execution3
{
	public static void main(String [] args)
	{
		QSEmplyoee q=new QSEmplyoee("RAM",23,7896541230l,"engineer",78965d,789,"btm","march");
		q.qprofile();
		q.salaryhike();
		q.profile();
		q.detailperson();

		TYEmployee t=new TYEmployee("Shyam",35,890367609l,"clerk",90282d,789);
		t.profile();
		t.detailperson();

		Man p=new Man("raja",56,785421369l);
		p.detailperson();
	}
}