class Person
{
int id;
String pname;
public Person(int id,String pname)
{
	this.id=id;
	this.pname=pname;
}
void display()
{
System.out.println("person name is : "+pname);
System.out.println("person id is : "+id);
}
}

class Student extends Person
{
int sid =204;
String stream="EE";

public Student(int id,String pname,int sid,String stream)
{
	super(id,pname);
	this.sid=sid;
	this.stream=stream;
}
 void details()
 {
 System.out.println("student sid is:"+ sid);
 System.out.println("student stream is:"+ stream);
 }
}
class Employee extends Person
{
String ename="raju";
int eid=309;
String dept="EC";
double sal=30000d;
public Employee(int id,String pname,String ename,int eid,String dept,double sal)
{
	super(id,pname);
	this.ename=ename;
	this.eid=eid;
	this.dept=dept;
	this.sal=sal;
}

void view()
{
System.out.println("employee name is:"+ename);
System.out.println("employee id is:"+eid);
System.out.println("employee dept is:"+dept);
System.out.println("employee sal is:"+sal);
}
}

class Executes1
{
public static void main(String [] args)
{
Person p=new Person(101,"raja");
p.display();

Student s=new Student(201,"rani",301,"shyam");
s.details();
s.display();
Employee e=new Employee(301,"vani","ramesh",401,"EE",100000d);
e.display();
e.view();

}}