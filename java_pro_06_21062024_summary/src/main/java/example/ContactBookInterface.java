package example;

public interface ContactBookInterface {

   Contact createContact();

   Contact getContact();

   Contact updateContact(Contact contact);

   boolean deleteContact();
}
