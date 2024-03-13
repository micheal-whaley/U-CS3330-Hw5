package enums;


/**
 * These are the toppings enums with their assigned cost value. There are methods that allow for setting the topping price
 * and getting the topping price of the respective topping.
 */
public enum Toppings { // toppings enums
	TOMATO(1.50),
	CHEESE(2.00),
	PINEAPPLE(2.50),
	BLACK_OLIVE(1.25),
	ITALIAN_SAUSAGE(3.50),
	PEPPERONI(3.00),
	BELL_PEPPER(1.00),
	MUSHROOM(1.50),
	CANADIAN_BACON(4.00);
	private double toppingPrice;
	
	Toppings(double d) {
		this.setToppingPrice(d); // price initializer
	}
	public double getToppingPrice() { // price getter
		return toppingPrice;
	}
	public void setToppingPrice(double toppingPrice) { //price setter
		this.toppingPrice = toppingPrice;
	}
}
