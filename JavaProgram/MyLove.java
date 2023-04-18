import java.util.Scanner;
class  MyLove
{
private int id;
private String name;
Scanner sc=new Scanner(System.in);
public MyLove(int id,String name)
{
    this.id=id;
	this.name=name;
}
public int getId()
{
return id;
}
public  void setId(int id)
{
	this.id=id;
	System.out.print("enter your new id");
	int id1=sc.nextInt();
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
	System.out.println("enter your name");
	String name1=sc.nextLine();

}

}

