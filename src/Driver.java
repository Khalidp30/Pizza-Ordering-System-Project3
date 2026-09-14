
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		System.out.println("----------------------");
		Scanner jojo = new Scanner(System.in);
		
		PizzaOrder orders = new PizzaOrder();
		// boolean loop to start the main menu while its true 
		boolean loop = true; 
		// start of while loop
		while(loop)
		{
			//main menu print display 
			System.out.println("MAIN MENU: "); 
			System.out.println("\t(O)rder a pizza");
            System.out.println("\t(S)pecials list");
            System.out.println("\t(R)eceipt display");
            System.out.println("\t(Q)uit");
            System.out.print("Enter Choice: ");
            
            //Grabbing the String choice to print out the valid characters of the main menu
            String choice = jojo.nextLine().toLowerCase();
            System.out.println("----------------------");
            // the letter keys that the user inputs 
            if (choice.length()!= 1 || !(choice.equals("o")| choice.equals("s")|| choice.equals("r")|| choice.equals("q")))
            {
            	System.out.println("Enter a valid character!");
            	continue; 
            }
            // switch statement to print the choice of Small medium large 
            switch(choice) {
            case "o" : 
            	System.out.println("SELECT PIZZA SIZE:");
                System.out.println("\t(S)mall");
                System.out.println("\t(M)edium");
                System.out.println("\t(L)arge");
                System.out.print("Enter Choice: ");
                String size = jojo.nextLine().toLowerCase();
                System.out.println("-----------------------");
 
                
                // pizza sizes setting to equal input letters 
                Pizza pizza = new Pizza();
                if(size.equals("s")) {
                    pizza.setSize(Size.SMALL);}
                else if(size.equals("m")) {
                    pizza.setSize(Size.MEDIUM);}
                else if(size.equals("l")) {
                    pizza.setSize(Size.LARGE);}
                else {
                	System.out.println("error Wrong Input");
                }
                // while loop to ensure the user can input their toppings
                while(true)
                {
                    System.out.println("SELECT TOPPINGS:");
                    System.out.println("\t(P)epperoni");
                    System.out.println("\t(S)ausage");
                    System.out.println("\t(O)nions");
                    System.out.println("\t(B)ell peppers");
                    System.out.println("\t(D)one - no more toppings to add");
                    System.out.print("Enter Choice: ");
                    
                    
                    String number2 = jojo.nextLine().toLowerCase();
                    System.out.println("------------------------");
                    if(number2.equals("p")) {
                        pizza.addTopping(Topping.PEPPERONI);}
                    if(number2.equals("s")) {
                        pizza.addTopping(Topping.SAUSAGE);}
                    else if(number2.equals("o")) {
                        pizza.addTopping(Topping.ONIONS);}
                    else if(number2.equals("b")) {
                        pizza.addTopping(Topping.PEPPERS);}
                    else if(number2.equals("d")) {
                    	break;
                    }
                    else {
                    	System.out.println("error Wrong Input");}
                
                }
                orders.addPizza(pizza);
                
                break; 
            case "s": 
            	System.out.println("SELECT SPECIAL:");
                System.out.println("\t(V)eggie Lovers Pizza");
                System.out.println("\t(M)eat Lovers Pizza");
                System.out.println("\t(B)ack to Main Menu");
                System.out.print("Enter Choice: ");
                
                String number3 = jojo.nextLine().toLowerCase();
                System.out.println("---------------------------------");
                
                if(number3.equals("v"))
                    orders.addPizza(new VeggieLoversPizza());
                else if(number3.equals("m"))
                    orders.addPizza(new MeatLoversPizza());
                break;
            case "r":
                orders.display();
                break;
            case "q":
            	//loop will stop if the user inputs q to Quit the program. 
                loop = false;
                break;
            }
		}
	}
}