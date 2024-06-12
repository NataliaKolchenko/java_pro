package org.example.lection;

public class Contact {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(int id) {
        this.id = id;
        this.name = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public static class ContactBuilder {
        private Contact contactInstance;

        public ContactBuilder(int id) {
            contactInstance = new Contact(id);
        }

        public ContactBuilder setName (String name) {
            contactInstance.name = name;
            return this;
        }

        public ContactBuilder setPhoneNumber (String phoneNumber) {
            contactInstance.phoneNumber = phoneNumber;
            return this;
        }

        public ContactBuilder setEmail (String phoneEmail) {
            contactInstance.email = phoneEmail;
            return this;
        }

        public Contact build() {
            return contactInstance;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
