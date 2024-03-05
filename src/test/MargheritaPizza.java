package test;

import java.util.List;

public class MargheritaPizza extends AbstractPizza{

    public MargheritaPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
            int orderIDCounter, ICookingStrategy cookingStrategy, double cookingPrice) {
        super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, orderIDCounter, cookingStrategy, cookingPrice);
        //TODO Auto-generated constructor stub
    }
    public MargheritaPizza(MargheritaPizza Pizza){
        super(Pizza.toppingList, Pizza.getPriceWithoutToppings(), Pizza.getTotalPrice(), Pizza.getPizzaOrderID(),
        AbstractPizza.getOrderIDCounter(), Pizza.getCookingStrategy(), Pizza.getCookingPrice());
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