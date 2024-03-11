package test;

import java.util.List;

import enums.Toppings;

import enums.PizzaType;

public class PizzaCookingFactory {
	private List<Toppings> toppingList;

	public AbstractPizza createPizza(PizzaType pizzatype) {
		if (pizzatype == PizzaType.HAWAIIAN) {
				this.toppingList.add(Toppings.CANADIAN_BACON); // default hawaiian toppings added
				this.toppingList.add(Toppings.CHEESE);
				this.toppingList.add(Toppings.PINEAPPLE);
				HawaiianPizza pizza = new HawaiianPizza(toppingList);
				return pizza;
		} else if (pizzatype == PizzaType.MARGHERITA) {	
		        this.toppingList.add(Toppings.TOMATO); // default margherita toppings
		        this.toppingList.add(Toppings.CHEESE);
				MargheritaPizza pizza = new MargheritaPizza(toppingList);
				return pizza;
		} else if (pizzatype == PizzaType.SUPREME) {
		        this.toppingList.add(Toppings.TOMATO); // default supreme toppings
		        this.toppingList.add(Toppings.CHEESE);
		        this.toppingList.add(Toppings.BELL_PEPPER);
		        this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
		        this.toppingList.add(Toppings.PEPPERONI);
		        this.toppingList.add(Toppings.BLACK_OLIVE);
		        this.toppingList.add(Toppings.MUSHROOM);
		        SupremePizza pizza = new SupremePizza(toppingList);
				return pizza;
		} else {
		        this.toppingList.add(Toppings.TOMATO); // default vegetarian toppings
		        this.toppingList.add(Toppings.CHEESE);
		        this.toppingList.add(Toppings.BELL_PEPPER);
		        this.toppingList.add(Toppings.BLACK_OLIVE);
		        this.toppingList.add(Toppings.MUSHROOM);
		        VegetarianPizza pizza = new VegetarianPizza(toppingList);
				return pizza;
		}
	}
}
