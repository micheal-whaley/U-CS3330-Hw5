package test;

import java.util.List;

import enums.Toppings;

public class VegetarianPizza extends AbstractPizza{

    public VegetarianPizza(int orderID) {
        super(orderID);
        this.setPriceWithoutToppings(1.50); // price with no toppings
        this.setCookingPrice(0); // no cookingprice or strategy set at default
        this.toppingList.add(Toppings.TOMATO); // default vegetarian toppings
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.BELL_PEPPER);
        this.toppingList.add(Toppings.BLACK_OLIVE);
        this.toppingList.add(Toppings.MUSHROOM);
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