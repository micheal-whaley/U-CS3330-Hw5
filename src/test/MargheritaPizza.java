package test;

import java.util.List;

import enums.Toppings;

public class MargheritaPizza extends AbstractPizza{

    public MargheritaPizza(List<Toppings> toppingList) {
        super(toppingList);
        this.setPriceWithoutToppings(2.50);
        AbstractPizza.setOrderIDCounter(getOrderIDCounter()+1);
        this.setPizzaOrderID(getOrderIDCounter());
        this.setTotalPrice(2.50);
        this.setCookingPrice(0);
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