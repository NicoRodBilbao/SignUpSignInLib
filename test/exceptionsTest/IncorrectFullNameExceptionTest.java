package exceptionsTest;

import exceptions.IncorrectFullNameException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *This class tests the constructor of the exception class
 * IncorrectFullNameException.
 * 
 * @author Nicolás Rodríguez
 */
public class IncorrectFullNameExceptionTest {

     @Test
    public void testConstructor() {
        assertTrue(new IncorrectFullNameException().getMessage().equals("ERROR: The full name has an incorrect format.\n\n(Use less than 50 characters)"));

    }

}
