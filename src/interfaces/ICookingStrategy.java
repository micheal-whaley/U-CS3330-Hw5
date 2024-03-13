package interfaces;

import test.AbstractPizza;

/**
 * The Cooking strategy interface used to set up all three cooking strategies.
 */
public interface ICookingStrategy {
	public boolean cook(AbstractPizza pizza);
	public String toString();
}
