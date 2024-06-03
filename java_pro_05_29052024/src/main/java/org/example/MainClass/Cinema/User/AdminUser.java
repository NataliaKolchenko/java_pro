package org.example.MainClass.Cinema.User;

public class AdminUser implements User{
    String userName;
    String userRole = "Admin";

    public AdminUser(String userName, String userRole) {
        this.userName = userName;

    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getUserRole() {
        return userRole;
    }
}
