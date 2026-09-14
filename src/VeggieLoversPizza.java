
public class VeggieLoversPizza extends Pizza

{
	
	public VeggieLoversPizza()
	{
		super.setSize(Size.LARGE);
		super.addTopping(Topping.ONIONS);
		super.addTopping(Topping.PEPPERS);
		
	}
	// overriding the size therefore the user can not input anything 
	public void setSize(Size size)
	{
		System.out.println("Size can not be changed.");
		
	}
	
	// Setting the price to 17 for a Large size vegan special 
	public int getPrice()
	{
		return 17;
	}

	// Override the Toppings 
	public void addTopping(Topping t)
	{
		System.out.println("Toppings can not be added.");
		
	}
	// Override Display setting out the veggie lover special
	public void display()
	{
		System.out.println("Veggie Lovers Special");
		super.display();
	}
}
