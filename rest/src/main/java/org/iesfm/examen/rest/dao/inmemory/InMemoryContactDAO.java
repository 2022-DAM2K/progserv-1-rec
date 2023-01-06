package org.iesfm.examen.rest.dao.inmemory;

import org.iesfm.examen.rest.dao.ContactDAO;
import org.iesfm.examen.rest.entity.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryContactDAO implements ContactDAO {
    private Map<Integer, Map<String, Contact>> contacts = new HashMap<>();

    public InMemoryContactDAO() {
        getUserContacts(1)
                .put("Bob Esponja", new Contact(1, "00001X", "Bob Esponja", "bob@esponja.es"));
    }

    @Override
    public List<Contact> listUserContacts(int userId) {
        return new ArrayList<>(getUserContacts(userId).values());
    }


    @Override
    public boolean existContact(int userId, String contactNif) {
        return getUserContacts(userId).containsKey(contactNif);
    }

    @Override
    public boolean deleteContact(int userId, String nif) {
        return getUserContacts(userId).remove(nif) != null;
    }


    @Override
    public boolean addContact(Contact contact) {
        if (existContact(contact.getUserId(), contact.getNif())) {
            return false;
        } else {
            getUserContacts(contact.getUserId()).put(contact.getNif(), contact);
            return true;
        }
    }

    private Map<String, Contact> getUserContacts(int userId) {
        contacts.putIfAbsent(userId, new HashMap<>());
        return contacts.get(userId);
    }
}
