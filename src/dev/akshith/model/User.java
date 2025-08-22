package dev.akshith.model;

/**
 * User class CSIS 505
 *
 * @author Akshith
 */
public class User {

    private int userId;
    private String email;
    private String name;
    private String password;
    private String userType;

    public User() {
    }

    // Constructor
    public User(int userId, String email, String name, String password, String userType) {
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.password = password;
        this.userType = userType;
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
