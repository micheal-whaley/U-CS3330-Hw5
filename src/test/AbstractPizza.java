package test;

import java.util.ArrayList;
import java.util.List;

import enums.Toppings;
import interfaces.ICookingStrategy;

public abstract class AbstractPizza {
	protected List<Toppings> toppingList;
	private double priceWithoutToppings;
	private double totalPrice;
	private int pizzaOrderID;
	private static int orderIDCounter;
	private ICookingStrategy cookingStrategy;
	private double cookingPrice;
	
	
	/**
	 * Initializes the base pizza and toppingList
	 * @param orderID
	 */
	
	public AbstractPizza(int orderID){
		this.pizzaOrderID = orderID;
		this.toppingList = new ArrayList<Toppings>();
	}


	/**
	 * This constructor is used for the copy constructor
	 * 
	 * @param toppingList
	 * @param priceWithoutToppings
	 * @param totalPrice
	 * @param pizzaOrderID
	 * @param cookingStrategy
	 * @param cookingPrice
	 */
	public AbstractPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super();
		this.toppingList = toppingList;
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = totalPrice;
		this.pizzaOrderID = pizzaOrderID;
		this.cookingStrategy = cookingStrategy;
		this.cookingPrice = cookingPrice;
	}

	// getters and setters

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
