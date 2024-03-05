package test;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza {
	private List<Toppings> toppingList;
	private double priceWithoutToppings;
	private double totalPrice;
	private int pizzaOrderID;
	private static int orderIDCounter;
	private ICookingStrategy cookingStrategy;
	private double cookingPrice;
	
	interface ICookingStrategy {
		public boolean cook(AbstractPizza pizza);
	}
	
	class BrickOvenCookingStrategy implements ICookingStrategy {
		public boolean cook(AbstractPizza pizza){
			pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+10.0);
			pizza.setCookingPrice(10.0);
			//pizza.setCookingStrategy(BrickOvenCookingStrategy); // NEEDS TO BE FIXED
			
			return true;
		}
	}
	
	class ConventionalOvenCookingStrategy implements ICookingStrategy {
		public boolean cook(AbstractPizza pizza){
			pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+8.0);
			pizza.setCookingPrice(8.0);
			//pizza.setCookingStrategy(ConventionalOvenCookingStrategy); // NEEDS TO BE FIXED
			
			return true;
		}
	}
	
	class MicrowaveCookingStrategy implements ICookingStrategy {
		public boolean cook(AbstractPizza pizza){
			pizza.setTotalPrice(pizza.getTotalPrice()-pizza.getCookingPrice()+1.0);
			pizza.setCookingPrice(1.0);
			//pizza.setCookingStrategy(MicrowaveCookingStrategy); // NEEDS TO BE FIXED
			
			return true;
		}
	}
	
	public enum PizzaType {
		HAWAIIAN,MARGHERITA,SUPREME,VEGETARIAN
	}
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
	
	public enum CookingStyleType {
		MICROWAVE, CONVENTIONAL_OVEN, BRICK_OVEN
	}
	
	
	public AbstractPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID, int orderIDCounter,
			ICookingStrategy cookingStrategy, double cookingPrice){
		//this.toppingList = toppingList; Don't know if this is needed
		this.toppingList = new ArrayList<Toppings>();
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = totalPrice;
		this.pizzaOrderID = pizzaOrderID;
		//this.orderIDCounter = orderIDCounter; I don't know if this is needed yet
		this.cookingStrategy = cookingStrategy;
		this.cookingPrice = cookingPrice;
	}


	public List<Toppings> getToppingList() {
		return toppingList;
	}


	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}


	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}


	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public int getPizzaOrderID() {
		return pizzaOrderID;
	}


	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}


	public static int getOrderIDCounter() {
		return orderIDCounter;
	}


	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}


	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}


	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}


	public double getCookingPrice() {
		return cookingPrice;
	}


	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
}
