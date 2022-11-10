package exceptionsTest;

import exceptions.EmailAlreadyExistsException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *This class tests the constructor of the exception class
 * EmailAlreadyExistsException.
 * 
 * @author Nicolás Rodríguez
 */
public class EmailAlreadyExistsExceptionTest {

    @Test
    public void testConstructor() {
        assertTrue(new EmailAlreadyExistsException().getMessage().equals("ERROR: The email already exists.)"));
        
    }

}
