package interfaces;

import test.AbstractPizza;

/**
 * Cooking strategy for the microwave. This costs 1.
 */
public class MicrowaveCookingStrategy implements ICookingStrategy {

	public boolean cook(AbstractPizza pizza){
		pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+1.0);
		pizza.setCookingPrice(1.0);
		pizza.setCookingStrategy(this);
		
		return true;
	}
	
	public String toString() {
		return ("MicrowaveCookingStrategy");
	}
}
