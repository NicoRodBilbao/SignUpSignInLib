package exceptions;

/**
 * This Exception is used for any error that involves the server on the server
 * side, this includes SQLExceptionand any other Exceptions that the program is
 * susceptible of.
 * 
 * Server side only.
 *
 * @author Nicolas Rodriguez
 */
public class ServerException extends Exception {

    public ServerException() {
        super("ERROR: There was an internal error regarding the server.");

    }
}
