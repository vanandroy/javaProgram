class Product
{
int id;
String quantity;
int price;
public Product(int id,String quantity,int price)
{
this.id=id;
this.quantity=quantity;
this.price=price;
}
 public String toString()
 {
 return id+" "+quantity+" "+price;
 }
 public static void main(String [] args)
 {
 Product p=new Product(123,"94kg",299);
 Product n=new Product(123,"200Kg",900);
  Product q=new Product(12233,"90Kg",90);
 System.out.println(p);
  System.out.println(n);
   System.out.println(q);
 
 }
 }