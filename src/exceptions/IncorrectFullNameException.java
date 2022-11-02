package exceptions;

/**
 * This Exception is used for any error caused by the wrong format of a full name
 *
 * @author Nicolas Rodriguez
 */
public class IncorrectFullNameException extends Exception {

    public IncorrectFullNameException() {
        super("ERROR: The full name has an incorrect format.\n\n(Use less than 50 characters)");
    }
}
