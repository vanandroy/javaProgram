class EmployeeTY3

{
String ename;
int eid;
double salary;
String designation;
long phoneno;

public  EmployeeTY3(String ename,int eid,double salary,String designation,long phoneno)
{
this.ename=ename;
this.eid=eid;
this.salary=salary;
this.designation=designation;
this.phoneno=phoneno;
}
public void detail()
{
System.out.println("employee name is "+ename);
System.out.println("employee id is "+eid);
System.out.println("employee salary is "+salary);
System.out.println("employee designation is "+designation);
System.out.println("employee phoneno is "+phoneno);
}
public static void main(String [] args)
{
EmployeeTY3 e1= new EmployeeTY3("ram",102,60000d,"designer",8923982302l);
EmployeeTY3 e2= new EmployeeTY3("shyam",202,60000d,"developer",8923482302l);
EmployeeTY3 e3=new EmployeeTY3("rakesh",204,58000d,"tester",2877282828L);
e1.detail();
e2.detail();
e3.detail();
}
}

