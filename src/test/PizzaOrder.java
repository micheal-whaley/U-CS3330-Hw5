package test;

import java.util.ArrayList;
import java.util.List;

import enums.CookingStyleType;
import enums.Toppings;
import interfaces.ICookingStrategy;
import enums.PizzaType;

public class PizzaOrder {
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	public PizzaOrder() {
		this.pizzaFactory = new PizzaCookingFactory();
		this.pizzaOrderList = new ArrayList<AbstractPizza>();
	}
	
	public void printListOfToppingsByPizzaOrderID(int orderID) { // loops through order list and prints to string pizzas;
		for(AbstractPizza p : pizzaOrderList) {
			if (p.getPizzaOrderID() == orderID) {
				p.toString();
			}
		}
	}
	
public void printPizzaOrderCart(int orderID) { 
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
	
	public boolean addPizzaToCart(int orderID, Toppings topping ) { 
		for (AbstractPizza pizza: pizzaOrderList){
			if(pizza.getPizzaOrderID() == orderID){
				//checking if the topping exists in the topping list 
				if(!pizza.getToppingList().contains(topping)){
					//add if it doesn't exist
					pizza.getToppingList().add(topping);
					//update the pizza price
					double price = pizza.getPriceWithoutToppings() + toppings.getPrice(topping);
					pizza.setTotalPrice(price);
					return true; //added 
				}
				else{
					return false;
				}
			}
		}
	
	}
	
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
	
	public boolean isThereAnyUncookedPizza() {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getCookingStrategy() == null) {
				return true; // Found an uncooked pizza
			}
		}
		return false; // No uncooked pizzas found
	}
//	
//	public double checkout() throws Exception { Van
//		
//	}
//	
//	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) { Van
//		
//	}
}
