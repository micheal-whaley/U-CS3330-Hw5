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
	
	public AbstractPizza() {
		
	}
	
	public AbstractPizza(List<Toppings> toppingList){
		//this.toppingList = toppingList; Don't know if this is needed
		this.toppingList = new ArrayList<Toppings>();
//		this.priceWithoutToppings = priceWithoutToppings;
//		this.totalPrice = totalPrice;
		this.pizzaOrderID = orderIDCounter;
//		//this.orderIDCounter = orderIDCounter; I don't know if this is needed yet
//		this.cookingStrategy = cookingStrategy;
//		this.cookingPrice = cookingPrice;
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
