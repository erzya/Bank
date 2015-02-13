import dao.ContactDao;
import general.Factory;
import model.Contact;

import java.sql.SQLException;

/**
 * Created by Nikolai on 13.02.2015.
 */
public class Enter {

    public static void main(String[] args) throws SQLException {
        // System.out.println("1");
        Factory factory = Factory.getInstance();
        // System.out.println("2");
        ContactDao contactDao = factory.getContactDao();

        contactDao.addContact(new Contact("34573453", "second", "erzya"));

        contactDao.addContact(new Contact("34573453", "second", "erzya2"));
        contactDao.addContact(new Contact("34573453", "second", "erzya3"));

        for (Contact cont : contactDao.getContacts()) {
            System.out.println("id - " + cont.getId() + "email - " + cont.getEmail() + ", mobile1 - " + cont.getMobileOne() + ", mobile 2- " + cont.getMobileTwo());
        }
    }

}
