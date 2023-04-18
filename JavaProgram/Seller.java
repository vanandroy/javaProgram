class Seller
{
public static void main(String [] args)
{
Mobile m=new Mobile("realme",60000f,"amoled display",11);
System.out.println("Brand name of Mobile" + m.getBrandname());
System.out.println(m.getPrice());
m.setPrice(75000f);
System.out.println(m.getPrice());
System.out.println("Feature of Mobile" + m.getFeature());
System.out.println("Android Version of mobile" + m.androidversion);
}}