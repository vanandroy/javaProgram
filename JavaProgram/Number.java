class Number
{
private String name;
int id;
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
System.out.println("name is updated sucessfully");
}
public Number(String name,int id)
{
this.name=name;
this.id=id;
}
}