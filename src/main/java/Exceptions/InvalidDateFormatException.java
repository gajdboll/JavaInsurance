
package Exceptions;

public class InvalidDateFormatException extends Exception{

    public InvalidDateFormatException() {
     super("Invalid Date Format");
                
    }
    public InvalidDateFormatException(String text) {
        
     super(text);
        
        
    }  
    
}
