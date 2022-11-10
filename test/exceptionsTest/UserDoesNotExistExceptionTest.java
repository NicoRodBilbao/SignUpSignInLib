package exceptionsTest;

import exceptions.UserDoesNotExistException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the constructor of the exception class
 * UserDoesNotExistException.
 *
 * @author Nicolás Rodríguez
 */
public class UserDoesNotExistExceptionTest {

    @Test
    public void testConstructor() {
        assertTrue(new UserDoesNotExistException().getMessage().equals("ERROR: The username does not match any existent User."));
        
    }

}
