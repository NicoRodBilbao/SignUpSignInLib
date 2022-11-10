package exceptionsTest;

import exceptions.PasswordDoesntMatchException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *This class tests the constructor of the exception class
 * PasswordDoesntMatchException.
 * 
 * @author Nicolás Rodríguez
 */
public class PasswordDoesntMatchExceptionTest {

    @Test
    public void testConstructor() {
        assertTrue(new PasswordDoesntMatchException().getMessage().equals("ERROR: The password fields do not match."));
        
    }

}
