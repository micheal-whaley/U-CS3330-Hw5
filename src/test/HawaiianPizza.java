package test;

import java.util.List;

public class HawaiianPizza extends AbstractPizza{
	
	public HawaiianPizza() {
		
	}

    public HawaiianPizza(List<Toppings> toppingList) {
        super(toppingList);
        this.toppingList.add(Toppings.CANADIAN_BACON); // default toppings added
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.PINEAPPLE);
        this.setPriceWithoutToppings(3.00);
        //TODO Auto-generated constructor stub
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
