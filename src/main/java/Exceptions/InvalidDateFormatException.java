package Exceptions;
/**
 * Invalid Date Format Exception -  wywoływany, gdy nieprawidłowa wartość jest wpisana.
 */
public class InvalidDateFormatException extends Exception {

    public InvalidDateFormatException() {
        super("Invalid Date Format");

    }
    public InvalidDateFormatException(String text) {

        super(text);
    }
}
