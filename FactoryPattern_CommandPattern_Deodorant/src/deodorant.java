

public abstract class deodorant{
private String brand,name,fragrance,gender,category;
private double quantity;
private double cost;


public String getName() { return name;}
public String getBrand() { return brand;}
public String getFragrance() { return fragrance;}
public String getGender() { return gender;}
public String getCategory() { return category;}
public void setName(String newName)
{name=newName;}

public void setBrand(String newBrand)
{brand=newBrand;}
public void setFragrance(String newFragrance)
{fragrance=newFragrance;}
public void setGender(String newGender)
{gender=newGender;}
public void setCategory(String newCategory)
{category=newCategory;}


public double getCost(){ return cost;}
public void setCost(double newCost)
{
	cost=newCost;
}
public double getQuantity(){ return quantity;}
public void setQuantity(double newQuantity)
{
	quantity=newQuantity;
}

public void describeDeo() {
	System.out.println("Name : "+getName()+"\nBrand : "+getBrand()+"\nFragrance : "+getFragrance()+"\nFor : "+getGender()+"\nCategory : "+getCategory()+"\nQuantity : "+getQuantity()+"oz"+"\nCost : "+getCost()+"$");
}
public void lockOn(deodorant newDeo) {
	System.out.println(name+" Deo is locked");
}
public void lockOff(deodorant newDeo) {
	System.out.println(name+" Deo is unlocked and ready to use");
}
public void sprayDeo(deodorant newDeo)
{
	quantity=quantity-0.02;
	System.out.println("Sprayed "+name+" remaining volume is "+quantity);
}

}

