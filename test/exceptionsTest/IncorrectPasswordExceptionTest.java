package exceptionsTest;

import exceptions.IncorrectPasswordException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *This class tests the constructor of the exception class
 * IncorrectPasswordException.
 * 
 * @author Nicolás Rodríguez
 */
public class IncorrectPasswordExceptionTest {

    @Test
    public void testConstructor() {
        assertTrue(new IncorrectPasswordException().getMessage().equals("ERROR: The password is incorrect or has an incorrect format.\n\n(Avoid using spaces)"));
        
    }

}
