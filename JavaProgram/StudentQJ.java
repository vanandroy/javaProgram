class StudentQJ
{
int id;
String name;
String stream;
long phoneno;
static String branch ="BTM";

public StudentQJ(int id,String name,String stream,long phoneno)
{
this.id=id;
this.name=name;
this.stream=stream;
this.phoneno=phoneno;
}
public static void main(String [] args)
{
StudentQJ s1=new StudentQJ(101,"pooja","cs",9028290157l);
StudentQJ s2=new StudentQJ(201,"riyaa","ee",9028490265l);
s1.displayprofile();
s2.displayprofile();
printbranch();
}
public void displayprofile()
{
System.out.println("name is" + name);
System.out.println("id is" + id);
System.out.println("stream is" + stream);
System.out.println("mobileno is" + phoneno);
}
public static void printbranch()
{

System.out.println("branch name is" + branch);
}
}