class Student4
{
private String sname;
private  int rolln;
private int sid;

public String getSname()
{
return sname;
}
public int getRolln()
{
return rolln;
}
public int getSid()
{
return sid;
}
public void setSid(int sid)
{
this.sid=sid;
}
public void setRolln(int rolln)
{
this.rolln=rolln;
}
public void setSname(String sname)
{
this.sname=sname;

System.out.println("enter your existing sname");
}
public Student4(String sname,int rolln,int sid)
{
this.sname=sname;
this.rolln=rolln;
this.sid=sid;
}
}