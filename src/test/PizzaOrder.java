package test;

import java.util.ArrayList;
import java.util.List;

import enums.CookingStyleType;
import enums.Toppings;
import interfaces.*;
import enums.PizzaType;

/**
 * Pizza Order manages a list of pizzas with sets of toppings, prices, and cooking strategies.
 * You can also add pizzas, take them away, and modify toppings.
 * 
 */

public class PizzaOrder {
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	ICookingStrategy brickStrategy = new BrickOvenCookingStrategy();
	ICookingStrategy microwaveStrategy = new MicrowaveCookingStrategy();
	ICookingStrategy conventionalStrategy = new ConventionalOvenCookingStrategy();
	private List<AbstractPizza> pizzaOrderList;
/**
 * Initializes the pizza factory and list of pizza,
 */
	public PizzaOrder() {
		this.pizzaFactory = new PizzaCookingFactory();
		this.pizzaOrderList = new ArrayList<AbstractPizza>();
	}
/**
 * Prints the list of toppings for the pizza with the specified order ID.
 * @param orderID the ID of Pizza order.
 */	
	public void printListOfToppingsByPizzaOrderID(int orderID) { // loops through order list and prints to string pizzas;
		for(AbstractPizza p : pizzaOrderList) {
			if (p.getPizzaOrderID() == orderID) {
				System.out.println(p.toString());
			}
		}
	}
 /**
     * Prints the details of the pizza order including toppings and prices for the specified order ID.
     * @param orderID the ID of the pizza order to print details for
     */
	public void printPizzaOrderCart(int orderID) {
		for (AbstractPizza p: pizzaOrderList) { //loops through each abstractpizza object
			if (p.getPizzaOrderID() == orderID) {
				System.out.println("Order details for order" + orderID);
				System.out.println("Toppings");
				for (Toppings topping: p.getToppingList()) {
					System.out.println("" + topping);
				}
				System.out.println("Price without toppings:"+ p.getPriceWithoutToppings());
				System.out.println("Total price" + p.getTotalPrice());
				System.out.println("Cooking Strategey:" + p.getCookingStrategy() );
			}
		}
		
	}
		

/**
 * Adds pizza to order list
 * @param orderID Id of pizza to be added
 * @param topping To check for toppings
 * @return returns true if successfully added, false if not.
 */
	public boolean addPizzaToCart(int orderID, Toppings topping ) { 
		boolean state = false;
		for (AbstractPizza pizza: pizzaOrderList){
			if(pizza.getPizzaOrderID() == orderID){
				//checking if the topping exists in the topping list 
				if(!pizza.getToppingList().contains(topping)){
					//add if it doesn't exist
					pizza.getToppingList().add(topping);
					//update the pizza price
					double price = pizza.getPriceWithoutToppings() + topping.getToppingPrice();
					pizza.setTotalPrice(price);
					state = true; //added 
				}
					
			}
		}
		return state;	
	}

	//	finds the pizza order with the given pizza order id and returns it.
	public AbstractPizza getPizzaByOrderID(int orderID) { 
		for (AbstractPizza p: pizzaOrderList){
			if(p.getPizzaOrderID() == orderID){
				return p;
			}
		}
		return null;	//returns null if order id does not exist 
	}
/**
 * Adds new topping to a pizza, and then updates the price if it's found.
 * @param orderID ID of pizza to modify.
 * @param topping Topping to add to pizza.
 * @return true if it was added, false if not.
 */
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if (pizza != null) {
			if (!pizza.getToppingList().contains(topping)) {
				// Add the topping if it doesn't exist
				pizza.getToppingList().add(topping);
				// Calculate price of topping
				double toppingPrice = topping.getToppingPrice();
				// Update the pizza price
				double newTotalPrice = pizza.getTotalPrice() + toppingPrice;
				pizza.setTotalPrice(newTotalPrice);
				return true; // Topping added successfully
			} else {
				return false;
			}
		}
		return false; // Pizza with given orderID not found
	}
	
/**
 * Subtracts a topping from the pizza, and the price is updated accordingly.
 * @param orderID Order Id of pizza to modify.
 * @param topping Topping that can be removed.
 * @return true or false based on if it was removed or if it didn't exist.
 */
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if (pizza != null) {
			// Check if the topping exists in the topping list
			if (pizza.getToppingList().contains(topping)) {
				// Remove the topping
				pizza.getToppingList().remove(topping);
				// Adjust the pizza price
				double toppingPrice = topping.getToppingPrice();
				double newTotalPrice = pizza.getTotalPrice() - toppingPrice;
				pizza.setTotalPrice(newTotalPrice);
				return true; // Topping removed successfully
			} else {
				return false; // Topping doesn't exist
			}
		}
		return false; // Pizza with given orderID not found
	}
/**
 * Checks if a pizza has a cooking strategy assigned.
 * @return
 */
	public boolean isThereAnyUncookedPizza() {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getCookingStrategy() == null) {
				return true; // Found an uncooked pizza
			}
		}
		return false; // No uncooked pizzas found
	}

/**
 * Calculates price of order and throws exception if any uncooked pizzas are found.
 * @return the total price of pizza
 * @throws Exception if any pizza has not been cooked yet.
 */
	public double checkout() throws Exception { // Van
		double price = 0.0;
		if (!isThereAnyUncookedPizza()) {
			for(AbstractPizza pizza: pizzaOrderList) {
				price += pizza.getTotalPrice();
			}
		} else {
			throw new Exception("Some pizzas are still undercooked!");
		}
		return price;
	}
/**
 * Selects cooking stragety for the pizza.
 * @param orderID
 * @param cookingStrategyType
 * @return
 */
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) { // Van
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if(cookingStrategyType.toString() == "BRICK_OVEN"){
			ICookingStrategy brickStrategy = new BrickOvenCookingStrategy();
			pizza.setCookingStrategy(brickStrategy);
			pizza.getCookingStrategy().cook(pizza);
		} else if (cookingStrategyType.toString() == "MICROWAVE"){
			ICookingStrategy microwaveStrategy = new MicrowaveCookingStrategy();
			pizza.setCookingStrategy(microwaveStrategy);
			pizza.getCookingStrategy().cook(pizza);
		} else if (cookingStrategyType.toString() == "CONVENTIONAL_OVEN"){
			ICookingStrategy conventionalStrategy = new ConventionalOvenCookingStrategy();
			pizza.setCookingStrategy(conventionalStrategy);
			pizza.getCookingStrategy().cook(pizza);
		} else {
			return false;
		}
		return true;
	}
}


