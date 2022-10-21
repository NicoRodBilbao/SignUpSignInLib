package exceptions;

/**
 * This Exception is used when the email introduced already exists on the
 * database or has an incorrect format.
 * 
 * Client side only.
 *
 * @author Nicolas Rodriguez
 */
public class EmailAlreadyExistsException extends Exception {

    public EmailAlreadyExistsException() {
        super("ERROR: The email already exists or the format is incorrect.\n\n(example@example,com)");

    }
}
