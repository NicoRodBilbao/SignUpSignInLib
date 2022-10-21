package exceptions;

/**
 * This Exception is used when the username is already in use in the database.
 * 
 * Client side only.
 *
 * @author Nicolas Rodriguez
 */
public class UserAlreadyExistsException extends Exception {
     public UserAlreadyExistsException() {
            super("ERROR: The username already exists.");
            
        }
}
