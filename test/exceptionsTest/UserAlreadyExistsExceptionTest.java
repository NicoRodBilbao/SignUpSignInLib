package exceptionsTest;

import exceptions.UserAlreadyExistsException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the constructor of the exception class
 * UserAlreadyExistException.
 *
 * @author Nicolás Rodríguez
 */
public class UserAlreadyExistsExceptionTest {
    
@Test
    public void testConstructor() {
        assertTrue(new UserAlreadyExistsException().getMessage().equals("ERROR: The username already exists."));
        
    }
    
}
