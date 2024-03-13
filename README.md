# U-CS3330-Hw5

Contributions:
Micheal: Set up the files, created AbstractPizza, added all class, set up the pizza order methods, updated the pizza classes, added all interfaces and enums, created javadocs for pizza subclasses
Temitope:Created the Abstract Pizza subclasses, added all subclasses, completed the addtopping and remove topping method 
Mel: Completed the printPizzaOrderCart method, completed the get PizzaByOrderID method, completed the addPizzaTocart method, completed the README
The program is an implementation of an automation system for a Pizza Store called FakeSpeare. It utilizes Factory and Strategy design patterns, Enum classes with methods, and assigns values to enums to manage pizza orders efficiently.

Here's a summary of the program:

AbstractPizza Class: An abstract base class with attributes representing pizza details such as topping list, price without toppings, total price, pizza order ID, cooking strategy, and cooking price. It also includes methods for adding toppings to price and updating pizza price.

Concrete Pizza Classes: Subclasses of AbstractPizza representing different types of pizzas, each with its constructor, copy constructors, setter/getter methods, and default toppings and prices.

Cooking Strategy Classes: Implementing the ICookingStrategy interface to define different cooking strategies such as BrickOvenCookingStrategy, ConventionalOvenCookingStrategy, and MicrowaveCookingStrategy.

PizzaOrder Class: Manages pizza orders with methods to print toppings, print pizza order cart, get pizza by order ID, add pizza to cart, add/remove toppings, check for uncooked pizzas, and calculate the total bill.

PizzaCookingFactory Class: Creates pizza instances based on the specified pizza type and assigns unique order IDs.

Enums: Define PizzaType, Toppings, and CookingStyleType enums to represent pizza types, toppings, and cooking styles respectively.

Main Class: Entry point of the program where pizza orders are instantiated, operations are performed, and the checkout process is initiated

