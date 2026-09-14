import java.util.ArrayList;

public class Pizza {


	private Size size;
	
	
	private ArrayList<Topping> userTopping = new ArrayList<>();
	
	/////////////////////////////////////
	public Size getSize()
	{
		return size; 
	}
	public void setSize(Size size)
	{
		this.size = size; 
	}
	// if statement for getting price of sizes SMALL Medium and Large
	public int getPrice()
	{
		int totalPrice = userTopping.size();
		
		if (size == Size.SMALL)
				totalPrice += 10;
		else if (size == Size.MEDIUM)
			totalPrice += 15;
		else if (size ==Size.LARGE)
			totalPrice += 20;
		return totalPrice;
	}
		// displaying size and toppings
	public void display()
	{
		System.out.println("Size:" + size.toString().toUpperCase());
		System.out.println("Toppings: ");
		for(Topping t: userTopping) 
		{
			System.out.println("\t\t" + t.toString().toUpperCase());
		}
	
		System.out.println("Item Price: $" + getPrice());
	}
	
	
	
	public void addTopping(Topping topping)
	{
		if (userTopping.size()<2)
		{
			userTopping.add(topping);
			
		}
		
		else if (userTopping.contains(topping)) 
		{
			System.out.println("The topping has already been add.");
		}
				
		}
	}