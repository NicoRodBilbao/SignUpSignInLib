package model;

import java.io.Serializable;

/**
 * This bean is the main way of communication between the server and client.
 * It includes:  
 *
 * @author nikol
 */
public class Package implements Serializable {
    
    private User user;
    private Action action;
    private Message message;
    /**
     * @param user The User needed for the action.
     * @param action The Action to be performed if the 
     * @param message
     */
    public Package(User user, Action action, Message message) {
        this.user = user;
        this.action = action;
        this.message = message;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setMessage(Message messaage) {
        this.message = messaage;
    }

    public User getUser() {
        return user;
    }

    public Action getAction() {
        return action;
    }

    public Message getMessage() {
        return message;
    }
    
}
