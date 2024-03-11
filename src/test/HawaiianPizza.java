package test;

import java.util.List;

import enums.Toppings;

public class HawaiianPizza extends AbstractPizza{
	
	public HawaiianPizza() {
		
	}

    public HawaiianPizza(List<Toppings> toppingList) {
        super(toppingList);
        this.setPriceWithoutToppings(3.00);
        AbstractPizza.setOrderIDCounter(getOrderIDCounter()+1);
        this.setPizzaOrderID(getOrderIDCounter());
        this.setTotalPrice(3.00);
        this.setCookingPrice(0);
        
    }
      public HawaiianPizza(HawaiianPizza Pizza){ // this needs to be changed for all pizzas
    	  super(Pizza.toppingList);
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
