package org.example.MainClass.Cinema.User;

public class ViewerUser implements User{
    String userName;
    String userRole = "User";

    public ViewerUser(String userName, String userRole) {
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
