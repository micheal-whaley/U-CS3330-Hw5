package test;

import java.util.ArrayList;
import java.util.List;

import enums.Toppings;

public class HawaiianPizza extends AbstractPizza{

    public HawaiianPizza(int orderID) {
        super(orderID);
        this.toppingList = new ArrayList<Toppings>();
        this.setPriceWithoutToppings(3.00); // price with no toppings
        this.setCookingPrice(0); // no cookingprice or strategy set at default
        this.toppingList.add(Toppings.CANADIAN_BACON); // default hawaiian toppings added
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.PINEAPPLE);
        double baseToppingCost = 0;
        for(Toppings a: toppingList) { // loops through adding toppingprice to overall cost
        	baseToppingCost+=a.getToppingPrice();
        }
        this.setTotalPrice(3.00+baseToppingCost);
    }
      public HawaiianPizza(HawaiianPizza Pizza){
    	  super(Pizza.getToppingList(), Pizza.getPriceWithoutToppings(), Pizza.getTotalPrice(), Pizza.getPizzaOrderID(), Pizza.getCookingStrategy(), Pizza.getCookingPrice());
      }     
	public String toString() {
        return String.format("Hawaiian Pizza Here is list of Toppings: %s, Price Without Toppings: %.2f, Total Price: %.2f, Pizza Order ID: %d, Order ID Counter: %d, Cooking Strategy: %s, Cooking Price: %.2f }",
                getToppingList().toString(),
                getPriceWithoutToppings(),
                getTotalPrice(),
                getPizzaOrderID(),
                getOrderIDCounter(),
                getCookingStrategy().toString(),
                getCookingPrice());
                //Placeholder, will clean up later.
    }
}
