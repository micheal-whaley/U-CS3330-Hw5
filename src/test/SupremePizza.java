package test;

import java.util.List;

public class SupremePizza extends AbstractPizza{

    public SupremePizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
            int orderIDCounter, ICookingStrategy cookingStrategy, double cookingPrice) {
        super(toppingList);
        this.toppingList.add(Toppings.TOMATO); // default toppings
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.BELL_PEPPER);
        this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
        this.toppingList.add(Toppings.PEPPERONI);
        this.toppingList.add(Toppings.BLACK_OLIVE);
        this.toppingList.add(Toppings.MUSHROOM);
        this.setPriceWithoutToppings(3.50);
        //TODO Auto-generated constructor stub
    }
    public SupremePizza(SupremePizza Pizza){
        super(Pizza.toppingList);
      }     
      public String toString() {
        return String.format("Supreme Pizza Here is list of Toppings: %s, Price Without Toppings: %.2f, Total Price: %.2f, Pizza Order ID: %d, Order ID Counter: %d, Cooking Strategy: %s, Cooking Price: %.2f }",
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