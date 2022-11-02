package exceptions;

/**
 * This Exception is used for when the passwords recieved do not match each
 * others content
 *
 * @author Nicolas Rodriguez
 */
public class PasswordDoesntMatchException extends Exception {

    public PasswordDoesntMatchException() {
        super("ERROR: The password fields do not match.");
    }
}
