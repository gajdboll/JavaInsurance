
package Exceptions;


public class NegativeNumberException extends Exception{

	public NegativeNumberException()
	{
		super("Nuber shouldn'tbe negative");
	}
	
	public NegativeNumberException(String text)
	{
		super(text);
	}
}
