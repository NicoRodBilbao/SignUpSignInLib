package exceptions;

/**
 * This Exception is used for any error caused by the wrong format of a password
 * or it not being equal to the one the User has.
 * 
 * Client side only.
 *
 * @author Nicolas Rodriguez
 */
public class IncorrectPasswordException extends Exception {

    public IncorrectPasswordException() {
        super("ERROR: The password is incorrect or has an incorrect format.\n\n(Avoid using spaces)");
    }
}
