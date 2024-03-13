package test;

import enums.CookingStyleType;
import enums.PizzaType;
import enums.Toppings;

public class Main {

	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();

		order.addPizzaToCart(PizzaType.HAWAIIAN);
		order.addPizzaToCart(PizzaType.SUPREME);
		order.addPizzaToCart(PizzaType.MARGHERITA);
		order.addPizzaToCart(PizzaType.VEGETARIAN);

		order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.MICROWAVE);
		order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.BRICK_OVEN);
		order.selectCookingStrategyByPizzaOrderID(3, CookingStyleType.CONVENTIONAL_OVEN);
		order.selectCookingStrategyByPizzaOrderID(4, CookingStyleType.MICROWAVE);

		order.printPizzaOrderCart(1);
		order.printPizzaOrderCart(2);
		order.printPizzaOrderCart(3);
		order.printPizzaOrderCart(4);
		order.printListOfToppingsByPizzaOrderID(1);

		double x = 0.0;
		try {
			x = order.checkout();
		} catch (Exception e) {
			e.printStackTrace();
		}


		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		// prints pizza order cart. Calls checkout to calculate the bill, throws exception if
		// triggered.
		// TODO
	}

}
