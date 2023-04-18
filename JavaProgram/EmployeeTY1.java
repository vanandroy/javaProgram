class EmployeeTY1
{
String ename;
int eid;
double salary;
String designation;
static String headoffice ="btm";

public EmployeeTY1(String ename,int eid,double salary,String designation)
{
 this.ename=ename;
 this.eid=eid;
 this.salary=salary;
 this.designation=designation;
}
 public static void main(String [] args)
 {
 EmployeeTY e1=new EmployeeTY("riya",102,60000d,"hr");
 EmployeeTY e2=new EmployeeTY("moni",202,60000d,"trainer");
 
 

  }
}