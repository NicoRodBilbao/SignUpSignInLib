package exceptions;

/**
 * This Exception is used when the email has an incorrect format.
 * 
 * Client side only.
 *
 * @author Nicolas Rodriguez
 */
public class IncorrectEmailException extends Exception {

    public IncorrectEmailException() {
        super("ERROR: The emails format is incorrect.\n\n(example@example,com)");

    }
}
