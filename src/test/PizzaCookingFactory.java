package test;

import java.util.ArrayList;
import java.util.List;

import test.AbstractPizza.PizzaType;
import test.AbstractPizza.Toppings;

public class PizzaCookingFactory {
	private List<Toppings> toppingList;

	public AbstractPizza createPizza(PizzaType pizzatype) {
		if (pizzatype == PizzaType.HAWAIIAN) {
	        this.toppingList.add(Toppings.CANADIAN_BACON); // default toppings added
	        this.toppingList.add(Toppings.CHEESE);
	        this.toppingList.add(Toppings.PINEAPPLE);
			//HawaiianPizza pizza = new HawaiianPizza(toppingList,3.00,3.00,AbstractPizza.getOrderIDCounter()+1,AbstractPizza.getOrderIDCounter(),0.00);
		}
		AbstractPizza pizza = new HawaiianPizza(); // this is wrong but is just to keep the program from erroring
		return pizza;
	}
}
