package exceptionsTest;

import exceptions.IncorrectEmailException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *This class tests the constructor of the exception class
 * IncorrectEmailException.
 * 
 * @author Nicolás Rodríguez
 */
public class IncorrectEmailExceptionTest {

    @Test
    public void testConstructor() {
        assertTrue(new IncorrectEmailException().getMessage().equals("ERROR: The emails format is incorrect.\n\n(example@example,com)"));
        
    }

}
