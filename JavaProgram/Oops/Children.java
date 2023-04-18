package Oops;

public class Children extends Main1 {
	int id;
	public Children(String name,int age,int id) {
		super(name,age);
		this.id=id;
	}
	public void details() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
	}

}
