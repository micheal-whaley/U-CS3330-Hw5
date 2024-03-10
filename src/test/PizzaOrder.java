package test;

import java.util.List;

import test.AbstractPizza.CookingStyleType;
import test.AbstractPizza.ICookingStrategy;
import test.AbstractPizza.PizzaType;
import test.AbstractPizza.Toppings;

public class PizzaOrder {
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	public PizzaOrder(PizzaCookingFactory pizzaFactory, List<AbstractPizza> pizzaOrderList) {
		this.pizzaFactory = pizzaFactory;
		this.pizzaOrderList = pizzaOrderList;
	}
	
	public void printListOfToppingsByPizzaOrderID(int orderID) {
		
	}
	
//	public void printPizzaOrderCart(int orderID) {
//		
//	}
//	
//	public AbstractPizza getPizzaByOrderID(int orderID) {
//		
//	}
//	
//	public boolean addPizzaToCart(PizzaType pizzaType) {
//		
//	}
//	
//	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
//		
//	}
//	
//	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
//		
//	}
//	
//	public boolean isThereAnyUncookedPizza() {
//		
//	}
//	
//	public double checkout() throws Exception {
//		
//	}
//	
//	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
//		
//	}
}
