package exceptions;

/**
 * This Exception is used when the client is unable to connect with the server
 * after trying for a specific amount of time.
 * 
 * Client side only.
 *
 * @author Nicolas Rodriguez
 */
public class TimeOutException extends Exception {
     public TimeOutException() {
            super("ERROR: Unable to connect to the database due to a timeout.");
            
        }
}
