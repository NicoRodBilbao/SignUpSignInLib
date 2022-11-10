package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import exceptionsTest.*;
import modelTest.*;

/**
 * This class executes all the methods of all the test classes in the tests
 * folder.
 *
 * @author Nicolás Rodríguez
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    EmailAlreadyExistsExceptionTest.class,
IncorrectEmailExceptionTest.class,
IncorrectFullNameExceptionTest.class,
IncorrectPasswordExceptionTest.class,
IncorrectUserExceptionTest.class,
PasswordDoesntMatchExceptionTest.class,
ServerExceptionTest.class,
TimeOutExceptionTest.class,
UserAlreadyExistsExceptionTest.class,
UserDoesNotExistExceptionTest.class,
PackageTest.class,
UserTest.class}) 
public class TestSuite {
}