package interfaces;

import test.AbstractPizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {
	private ICookingStrategy ConventionalOvenCookingStrategy;
	
	public boolean cook(AbstractPizza pizza){
		pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+8.0);
		pizza.setCookingPrice(8.0);
		pizza.setCookingStrategy((ICookingStrategy)ConventionalOvenCookingStrategy); // NEEDS TO BE FIXED
		
		return true;
	}
}
