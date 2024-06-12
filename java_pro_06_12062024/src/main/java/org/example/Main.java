package org.example;

public class Main {
    public static void main(String[] args) {

        ContactServiceImpl contacts = new ContactServiceImpl();
        contacts.createNewContact(new Contact.ContactBuilder(1).setName("John").build());
        contacts.createNewContact(new Contact.ContactBuilder(1).setName("John").build());
        contacts.createNewContact(new Contact.ContactBuilder(1).setName("John").build());
        contacts.createNewContact(new Contact.ContactBuilder(1).setName("John").build());

        contacts.createNewContact(new Contact.ContactBuilder(2).setName("Anna").setPhoneNumber("012932097").build());

        contacts.createNewContact(new Contact.ContactBuilder(3).setName("Kate").setPhoneNumber("000232").setEmail("wew@gmail.com").build());

//        System.out.println(contacts.getContactById(1));
//        System.out.println(contacts.getContactById(2));
//        System.out.println(contacts.getContactById(3));

        System.out.println(contacts);

        contacts.updateContactByID(1, new Contact.ContactBuilder(1).setPhoneNumber("77777777").build());
        System.out.println();
        System.out.println(contacts.getContactById(1));

        contacts.deleteContactByID(3);
        System.out.println();
        System.out.println(contacts);


    }
}