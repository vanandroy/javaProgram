class Info1
{
public static void main(String [] args)
{
	Child s=new Child("raja",19,103,"EE");
	s.displayChild();
	
	Person1 p=new Person1(); /* not passing any values bcoz in person class there is no parameterized constructor */ 
	
	p.displayPerson();/*name will be null and age will be zero
	                      because default constructor executed */
	p.name="amit"; //giving value directly ,now null replaced by amit
	p.age=29; //now 0 replaced by 29
	p.displayPerson(); //name will be printed as amit and age will be 29
	                   //p.displayChild(); 
	                       /* this line will produce compilation error bcoz displayChild()method is in child 
	                       class Child.parent object cannot access child class members */
	                       
	
	
	
}
}
