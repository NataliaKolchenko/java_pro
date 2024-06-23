package example;

import java.util.Objects;
import java.util.UUID;

class Contact {
    private UUID id;
    private String name;
    private  String lastName;
    private String phoneNumber;
    private String email;

    Contact(ContactBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        Contact c = (Contact) obj;
        return c.name.equals(this.name) && c.lastName.equals(this.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    public class ContactBuilder {

        private UUID id;
        private String name;
        private  String lastName;
        private String phoneNumber;
        private String email;

        public ContactBuilder() {
        }

        public ContactBuilder setName (String name){
            this.name = name;
            return this;
        }

        public ContactBuilder setLastName (String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContactBuilder setPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ContactBuilder setEmail (String email) {
            this.email = email;
            return this;
        }

        public Contact build () {
            return new Contact(this);
        }
    }


}