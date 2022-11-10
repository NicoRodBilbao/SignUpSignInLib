package exceptionsTest;

import exceptions.IncorrectUserException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *This class tests the constructor of the exception class
 * IncorrectUserException.
 * 
 * @author Nicolás Rodríguez
 */
public class IncorrectUserExceptionTest {

    @Test
    public void testConstructor() {
        assertTrue(new IncorrectUserException().getMessage().equals("ERROR: The username is incorrect or has an incorrect format.\n\n(Avoid using spaces)"));
        
    }

}
