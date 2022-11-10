package modelTest;

import model.Action;
import model.Message;
import org.junit.Test;
import static org.junit.Assert.*;

import model.Package;
import model.User;
import model.UserPrivilege;
import model.UserStatus;

/**
 * This class tests the parametrized constructor of the bean Package.
 *
 * @author MagicSalad
 */
public class PackageTest {

    @Test
    public void testConstructor() {
        Package pack = new Package(new User(1, "", "", "", UserStatus.ENABLED, UserPrivilege.USER, ""), Action.LOGIN, Message.OK);
        assertTrue((pack.getUser().getId() ==1)&&(pack.getMessage().equals(Message.OK))&&(pack.getAction().equals(Action.LOGIN)));
    }

}
