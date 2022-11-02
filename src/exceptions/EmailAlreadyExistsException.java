package exceptions;

/**
 * This Exception is used when the email introduced already exists on the
 * database 
 * 
 * Client side only.
 *
 * @author Nicolas Rodriguez
 */
public class EmailAlreadyExistsException extends Exception {

    public EmailAlreadyExistsException() {
        super("ERROR: The email already exists.)");

    }
}
