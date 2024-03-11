package interfaces;

import test.AbstractPizza;
//import interfaces.ICookingStrategy;

public class BrickOvenCookingStrategy implements ICookingStrategy {
	private ICookingStrategy BrickOvenCookingStrategy;

	public boolean cook(AbstractPizza pizza){
		pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+10.0);
		pizza.setCookingPrice(10.0);
		pizza.setCookingStrategy((ICookingStrategy)BrickOvenCookingStrategy); // NEEDS TO BE FIXED
		
		return true;
	}
}
