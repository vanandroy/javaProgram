import java.util.Scanner;


class Raja

{
	private int id;
	private String name;
	Scanner sc=new Scanner(System.in);
	public Raja(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	void setId(int id)
	{
		this.id=id;
		System.out.print("your id is updated");
		int n=sc.nextInt();
	}
	public String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
		System.out.println("your name is updated");
		String me=sc.nextLine();

	}

}

