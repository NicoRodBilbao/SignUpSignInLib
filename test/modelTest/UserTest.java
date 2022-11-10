package modelTest;

import model.User;
import model.UserPrivilege;
import model.UserStatus;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the parametrized constructor of the bean User.
 *
 * @author Nicolás Rodríguez
 */
public class UserTest {

    @Test
    public void testConstructor() {
        User user = new User(1, "l", "e", "f", UserStatus.ENABLED, UserPrivilege.USER, "p");
        assertTrue((user.getId()==1)&&(user.getLogin().equals("l"))&&(user.getEmail().equals("e"))&&(user.getFullName().equals("f"))&&(user.getStatus().equals(UserStatus.ENABLED))&&(user.getPrivilege().equals(UserPrivilege.USER))&&(user.getPassword().equals("p")));
    }

}
