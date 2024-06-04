package org.example;

import java.util.UUID;

public class Host {
    private String fullname;
    private UUID id;
    private String email;
    private String displayName;
    private String username;
    private String image;

    public Host(String fullName, String email,  String username, String image) {
        this.fullname = fullName;
        id = UUID.randomUUID();
        this.email = email;
        this.displayName = displayName;
        this.username = username;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Host{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", displayName='" + displayName + '\'' +
                ", username='" + username + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
