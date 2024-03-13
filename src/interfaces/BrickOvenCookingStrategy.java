package interfaces;

import test.AbstractPizza;
//import interfaces.ICookingStrategy;

/**
 * Cooking strategy for brick oven. This costs 10
 */
public class BrickOvenCookingStrategy implements ICookingStrategy {

	public boolean cook(AbstractPizza pizza){
		pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+10.0);
		pizza.setCookingPrice(10.0);
		pizza.setCookingStrategy(this);
		
		return true;
	}
}
