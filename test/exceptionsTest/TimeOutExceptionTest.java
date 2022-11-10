package exceptionsTest;

import exceptions.TimeOutException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *This class tests the constructor of the exception class
 * TimeOutException.
 * 
 * @author Nicolás Rodríguez
 */
public class TimeOutExceptionTest {

    @Test
    public void testConstructor() {
        assertTrue(new TimeOutException().getMessage().equals("ERROR: Unable to connect to the database due to a timeout."));
        
    }

}
