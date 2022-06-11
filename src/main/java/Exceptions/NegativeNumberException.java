
package Exceptions;
/**
 * Negative Number Exception - wyjątek wywoływany, gdy jest wpisana liczba ujemna.
 * 
 */

public class NegativeNumberException extends Exception{

	public NegativeNumberException()
	{
		super("Number shouldn't be negative");
	}
	
	public NegativeNumberException(String text)
	{
		super(text);
	}
}
