
import java.util.ArrayList;

public class PizzaOrder {
	
	ArrayList<Pizza> newPizza = new ArrayList<>();
	
	public double getPrice()
	{
		double TotalPrice = 0; 
		for(Pizza i: newPizza)
			TotalPrice += i.getPrice();
		
		return TotalPrice;
	}
	
	public void display()
	{
		System.out.println("----------------------");
		System.out.println("ORDER RECEIPT");
		System.out.println("----------------------");
		for(Pizza i: newPizza)
		{
			i.display();
			System.out.println("-------------------");
		}
		System.out.println("SUBTOTAL: $" + getPrice()); 
		double Tax = getPrice()*0.08;
		double Total = getPrice()+ Tax; 
		System.out.print("TAX: $" + String.format("%.2f",Tax));
		System.out.println("\nTotal: $" + Total);
		System.out.println("---------------------");
		
	}
	public void addPizza(Pizza pizzas)
	{
		if (newPizza.size()< 20 )
		{
			newPizza.add(pizzas);
		}
		else 
		{
			System.out.print("Pizza Order May Not Exceed 20 Pizzas!");
		}
	}
}