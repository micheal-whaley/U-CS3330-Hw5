package interfaces;

import test.AbstractPizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {
	
	public boolean cook(AbstractPizza pizza){
		pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+8.0);
		pizza.setCookingPrice(8.0);
		pizza.setCookingStrategy(this);
		
		return true;
	}
}
