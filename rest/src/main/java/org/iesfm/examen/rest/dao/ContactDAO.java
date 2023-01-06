package org.iesfm.examen.rest.dao;

import org.iesfm.examen.rest.entity.Contact;

import java.util.List;

public interface ContactDAO {

    List<Contact> listUserContacts(int userId);

    boolean existContact(int userId, String contactNif);

    boolean deleteContact(int userId, String contactNif);

    boolean addContact(Contact contact);

}
