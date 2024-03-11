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
	return null;	//retnrs null if order id does not exist 
}
//	
//	public boolean addPizzaToCart(PizzaType pizzaType) { Mel
//		
//	}
//	
//	public boolean addNewToppingToPizza(int orderID, Toppings topping) { Temi
//		
//	}
//	
//	public boolean removeToppingFromPizza(int orderID, Toppings topping) { Temi
//		
//	}
//	
//	public boolean isThereAnyUncookedPizza() { Temi
//		
//	}
//	
	public double checkout() throws Exception { // Van

		return 0.0;
	}
//	
//	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) { Van
//		
//	}
}
