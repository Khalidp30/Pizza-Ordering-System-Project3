
public class MeatLoversPizza extends Pizza {

	// opening meatlover to a superclass 
	public MeatLoversPizza() 
	{
		super.setSize(Size.LARGE);
		super.addTopping(Topping.PEPPERONI);
		super.addTopping(Topping.SAUSAGE);
		
	}
	
	
	// method to not change size 
	public void setSize(Size size)
	{
		System.out.println("Size can not be changed.");
	}
	
	//setting get price to 18 
	public int getPrice()
	{
		return 18;
	}
	
	// method for overriding toppings 
	public void addTopping(Topping t)
	{
		
		System.out.println("Topping can not be added.");
		
	}
	// Overriding the display of Special meat lover pizza pie 
	public void display()
	{
		System.out.println("Meat Lovers Special");
		super.display();
	}
}
