
class Product1
{
int id;
String quantity;
int price;
public Product1(int id,String quantity,int price)
{
this.id=id;
this.quantity=quantity;
this.price=price;
}
 public String toString()
 {
 return id+" "+quantity+" "+price;
 }
 public boolean equals(Product1 h)
 {
	 if((this.quantity.equals(h.quantity)==true)&&(this.id==h.id))
	 
		 return true;
		 
		 
		 else 
		 
			 return false;
		 
	 }
 
 
 public static void main(String [] args)
 {
 Product1 p=new Product1(123,"94Kg",299);
 Product1 n=new Product1(123,"94Kg",299);
  Product1 q=new Product1(123,"94Kg",299);
 System.out.println(p);
  System.out.println(n);
   System.out.println(q);
   
   System.out.println(p.equals(n));
   System.out.println(n.equals(q));
   System.out.println(p.equals(q));
   
 }
 }