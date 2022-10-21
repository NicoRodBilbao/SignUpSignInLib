package interfaces;

import model.User;

/**
 * This interface implements the methods necessary for the management of the
 * Users on the database.
 *
 * @author Nicolas Rodriguez
 */
public interface Userable {    
    public User login(String username);
    
    public void signUp(User user);
}
