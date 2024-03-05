package test;

import java.util.List;

public class VegetarianPizza extends AbstractPizza{

    public VegetarianPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
            int orderIDCounter, ICookingStrategy cookingStrategy, double cookingPrice) {
        super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, orderIDCounter, cookingStrategy, cookingPrice);
        //TODO Auto-generated constructor stub
    }

    public VegetarianPizza(VegetarianPizza Pizza){
        super(Pizza.toppingList, Pizza.getPriceWithoutToppings(), Pizza.getTotalPrice(), Pizza.getPizzaOrderID(),
        AbstractPizza.getOrderIDCounter(), Pizza.getCookingStrategy(), Pizza.getCookingPrice());
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