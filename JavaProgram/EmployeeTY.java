class EmployeeTY
{
String ename;
int eid;
double salary;
String designation;
static String headoffice ="btm";

public EmployeeTY(String ename,int eid,double salary,String designation)
{
 this.ename=ename;
 this.eid=eid;
 this.salary=salary;
 this.designation=designation;
}
 void detail()
 {System.out.println("name of employee is" +ename);
 System.out.println("id of employee is" +eid);
 System.out.println("salary of employee is"+salary);
 System.out.println("designation of employee is"+designation);
 }
 
 public static void main(String [] args)
 {
 EmployeeTY e1=new EmployeeTY("riya",102,60000d,"hr");
 EmployeeTY e2=new EmployeeTY("moni",202,60000d,"trainer");
 e1.detail();
 e2.detail();

 
  }
}