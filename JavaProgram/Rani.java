class Rani
{
public static void main(String [] args)
{
MyLove q=new MyLove(132,"preeti");
System.out.println("your old id is :" + q.getId());
q.setId(165);

System.out.println("your new id is :" + q.getId());


System.out.println("enter your name: ");
q.setName("veer");
System.out.println("your name is :" + q.getName());
}
}