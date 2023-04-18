
class Child extends Person1
{
	int sid;
	String stream;

	public Child(String name,int age,int sid,String stream)
	{
		this.name=name;
		this.age=age;
		this.sid=sid;
		this.stream=stream;
	}

	public void displayChild()
	{
		displayPerson();
		System.out.println("student id is :"+sid);
		System.out.println("student stream is :"+stream);
	}

}