package exceptions;

/**
 * This Exception is used for any error caused by the absence of the User on the
 * database.
 * 
 * Client side only.
 *
 * @author Nicolas Rodriguez
 */
public class UserDoesNotExistException extends Exception {

    public UserDoesNotExistException() {
        super("ERROR: The username does not match any existent User.");
    }
}
