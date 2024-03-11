package test;

import java.util.List;

public class MargheritaPizza extends AbstractPizza{

    public MargheritaPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
            int orderIDCounter, ICookingStrategy cookingStrategy, double cookingPrice) {
        super(toppingList);
        this.toppingList.add(Toppings.TOMATO); // default toppings
        this.toppingList.add(Toppings.CHEESE);
        this.setPriceWithoutToppings(2.50);
        //TODO Auto-generated constructor stub
    }
    public MargheritaPizza(MargheritaPizza Pizza){
        super(Pizza.toppingList);
      }     
   
      public String toString() {
        return String.format("Margherita Pizza Here is list of Toppings: %s, Price Without Toppings: %.2f, Total Price: %.2f, Pizza Order ID: %d, Order ID Counter: %d, Cooking Strategy: %s, Cooking Price: %.2f }",
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