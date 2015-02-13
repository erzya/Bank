package dao;

import model.Contact;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Nikolai on 13.02.2015.
 */
public interface ContactDao {

    public void addContact(Contact contact) throws SQLException;
    public void deleteContact(Contact contact) throws SQLException;
    public Contact getContact(int id) throws SQLException;
    public List<Contact> getContacts()throws SQLException;

}
