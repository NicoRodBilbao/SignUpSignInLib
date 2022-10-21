package model;

/**
 * This bean is the main way of communication between the server and client.
 * It includes:  
 *
 * @author nikol
 */
public class Package {
    
    private User user;
    private Action action;
    private Message messaage;
    /**
     * @param user The User needed for the action.
     * @param action The Action to be performed if the 
     * @param message
     */
    public Package(User user, Action action, Message message) {
        this.user = user;
        this.action = action;
        this.messaage = message;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setMessaage(Message messaage) {
        this.messaage = messaage;
    }

    public User getUser() {
        return user;
    }

    public Action getAction() {
        return action;
    }

    public Message getMessaage() {
        return messaage;
    }
    
}
