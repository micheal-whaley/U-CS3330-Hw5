package test;

import java.util.List;

import enums.Toppings;

import enums.PizzaType;

public class PizzaCookingFactory {
	private List<Toppings> toppingList;

	/**
	 * This method creates a pizza based on the pizza type. It also increments the orderIDCounter value and
	 * sets that value to the new pizza. It then returns the created pizza. It also returns null if the pizzatype is not
	 * a valid pizzatype.
	 * @param pizzatype
	 * @return
	 */
	public AbstractPizza createPizza(PizzaType pizzatype) {
		if (pizzatype == PizzaType.HAWAIIAN) {
				AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter()+1);
				HawaiianPizza pizza = new HawaiianPizza(AbstractPizza.getOrderIDCounter());
				return pizza;
		} else if (pizzatype == PizzaType.MARGHERITA) {	
				AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter()+1);
				MargheritaPizza pizza = new MargheritaPizza(AbstractPizza.getOrderIDCounter());
				return pizza;
		} else if (pizzatype == PizzaType.SUPREME) {
				AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter()+1);
		        SupremePizza pizza = new SupremePizza(AbstractPizza.getOrderIDCounter());
				return pizza;
		} else if (pizzatype == PizzaType.VEGETARIAN) {
				AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter()+1);
		        VegetarianPizza pizza = new VegetarianPizza(AbstractPizza.getOrderIDCounter());
				return pizza;
		} else {
			return null;
		}
	}
}
