package test;

import java.util.List;

import enums.Toppings;

public class VegetarianPizza extends AbstractPizza{

    public VegetarianPizza(List<Toppings> toppingList) {
        super(toppingList);
        this.setPriceWithoutToppings(1.50); // price with no toppings
        AbstractPizza.setOrderIDCounter(getOrderIDCounter()+1); // increments id counter and then sets orderID
        this.setPizzaOrderID(getOrderIDCounter());
        this.setCookingPrice(0); // no cookingprice or strategy set at default
        double baseToppingCost = 0;
        for(Toppings a: toppingList) { // loops through adding toppingprice to overall cost
        	baseToppingCost+=a.getToppingPrice();
        }
        this.setTotalPrice(1.50+baseToppingCost);
    }

    public VegetarianPizza(VegetarianPizza Pizza){
  	  super(Pizza.getToppingList(), Pizza.getPriceWithoutToppings(), Pizza.getTotalPrice(), Pizza.getPizzaOrderID(), Pizza.getCookingStrategy(), Pizza.getCookingPrice());
      }     
      public String toString() {
        return String.format("Vegetarian Pizza Here is list of Toppings: %s, Price Without Toppings: %.2f, Total Price: %.2f, Pizza Order ID: %d, Order ID Counter: %d, Cooking Strategy: %s, Cooking Price: %.2f }",
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