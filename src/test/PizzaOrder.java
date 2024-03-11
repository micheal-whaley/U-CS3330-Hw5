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
	
//	public void printPizzaOrderCart(int orderID) { Mel
//		
//	}
//	
//	public AbstractPizza getPizzaByOrderID(int orderID) { Mel
//		
//	}
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
//	public double checkout() throws Exception { Van
//		
//	}
//	
//	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) { Van
//		
//	}
}
