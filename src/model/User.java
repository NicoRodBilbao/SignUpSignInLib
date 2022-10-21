package model;

/**
 * This bean is the main data object of the Application.
 *
 * @author Nicolas Rodriguez
 */
public class User {
    private Integer id;
    private String login;
    private String email;
    private String fullName;
    private UserStatus status;
    private UserPrivilege privilege;
    private String password;

    public User(Integer id, String login, String email, String fullName, UserStatus status, UserPrivilege privilege, String password) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.fullName = fullName;
        this.status = status;
        this.privilege = privilege;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public UserStatus getStatus() {
        return status;
    }

    public UserPrivilege getPrivilege() {
        return privilege;
    }

    public String getPassword() {
        return password;
    }
        
}
