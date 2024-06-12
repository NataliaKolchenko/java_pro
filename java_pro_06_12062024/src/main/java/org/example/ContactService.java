package org.example;

public interface ContactService {

    public void createNewContact (Contact newContact);
    public Contact getContactById(int id);
    public void updateContactByID(int id, Contact newContact);
    public void deleteContactByID(int id);
}
