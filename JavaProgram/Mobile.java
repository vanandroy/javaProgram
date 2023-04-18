class Mobile
{
private String brandname;
private float price;
private String feature;
int androidversion;

public String getBrandname()
{
return brandname;
}
public float getPrice()
{
return price;
}
public String getFeature()
{
return feature;
}
public void setPrice(float price)
{
this.price=price;
System.out.println("price is updated");
}
public Mobile(String brandname, float price,String feature, int androidversion)
{
this.brandname=brandname;
this.price=price;
this.feature=feature;
this.androidversion=androidversion;
}
}