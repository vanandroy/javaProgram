class Car extends Vehicle1
{
 String type;
 String shop;
 
 public Car(String brand,int price,String colour,String model,String type,String shop)
 {

 this.type=type;
 this.shop=shop;
 }
 public void detailsCar()
 {
 System.out.println("car type :"+type);
 System.out.println("shop name :"+shop);
 }
 
 }