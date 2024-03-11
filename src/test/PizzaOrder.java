package test;

import java.util.List;

import enums.CookingStyleType;
import enums.Toppings;
import interfaces.ICookingStrategy;
import enums.PizzaType;

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
