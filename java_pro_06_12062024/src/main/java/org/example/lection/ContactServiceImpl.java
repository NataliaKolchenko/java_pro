package org.example.lection;

import java.util.ArrayList;

public class ContactServiceImpl implements ContactService{
private ArrayList<Contact> contactsList = new ArrayList<>();
    @Override
    //переделать на boolean
    public void createNewContact(Contact newContact) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (newContact.getId() == contactsList.get(i).getId()) {
                return;
            }
        }

        contactsList.add(newContact);
    }

    @Override
    public Contact getContactById(int id) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getId() == id) {
                return contactsList.get(i);
            }

        }
        return null;
    }

    @Override
    public void updateContactByID(int id, Contact newContact) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getId() == id) {
                if (!newContact.getEmail().isEmpty()) {
                    contactsList.get(i).setEmail(newContact.getEmail());
                }
                if (!newContact.getName().isEmpty()) {
                    contactsList.get(i).setName(newContact.getName());
                }
                if (!newContact.getPhoneNumber().isEmpty()) {
                    contactsList.get(i).setPhoneNumber(newContact.getPhoneNumber());
                }
                return;
            }
        }
    }

    @Override
    //boolean
    public void deleteContactByID(int id) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getId() == id) {
                contactsList.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder("");
        for (Contact co : contactsList) {
            st.append(co).append('\n');

        }
        return String.valueOf(st);
    }
}
