package interfaces;

import test.AbstractPizza;

class MicrowaveCookingStrategy implements ICookingStrategy {
	private ICookingStrategy MicrowaveCookingStrategy;
	public boolean cook(AbstractPizza pizza){
		pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+1.0);
		pizza.setCookingPrice(1.0);
		pizza.setCookingStrategy((ICookingStrategy)MicrowaveCookingStrategy); // NEEDS TO BE FIXED
		
		return true;
	}
}
