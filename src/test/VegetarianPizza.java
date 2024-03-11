package test;

import java.util.List;

import enums.Toppings;

public class VegetarianPizza extends AbstractPizza{

    public VegetarianPizza(List<Toppings> toppingList) {
        super(toppingList);
        this.setPriceWithoutToppings(1.50);
        //TODO Auto-generated constructor stub TOMATO, CHEESE, BELL_PEPPER, BLACK_OLIVE, MUSHROOM
    }

    public VegetarianPizza(VegetarianPizza Pizza){
        super(Pizza.toppingList);
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