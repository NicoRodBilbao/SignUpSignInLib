package exceptions;

/**
 * This Exception is used for any error caused by the wrong format of a username
 * or it not being equal to the one the User has.
 *
 * @author Nicolas Rodriguez
 */
public class IncorrectUserException extends Exception {

    public IncorrectUserException() {
        super("ERROR: The password is incorrect or has an incorrect format.\n\n(Avoid using spaces)");
    }
}
