import dao.ContactDao;
import general.Factory;
import model.Contact;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Nikolai on 13.02.2015.
 */
public class Enter {

    public static void main(String[] args) throws SQLException {
        // System.out.println("1");
        Factory factory = Factory.getInstance();
        // System.out.println("2");
        ContactDao contactDao = factory.getContactDao();

      contactDao.deleteContact(contactDao.getContact(1));

     System.out.println(contactDao.getContact(0));
        System.out.println(contactDao.getContact(1));

      /*  contactDao.addContact(new Contact("23453", "second", "gfdda"));

        contactDao.addContact(new Contact("23", "423", "fgfdg2"));
        contactDao.addContact(new Contact("31", "ond", "ghjliua3"));*/
        List<Contact> list =  contactDao.getContacts();
        System.out.println(list.size());

        System.out.println("id		email		mobile1		mobile2		homenumber");
        for(Contact cont: list){
            System.out.println(cont.getId() + "     	" + cont.getEmail() + "		" + cont.getMobileOne()
                    + "	" + cont.getMobileTwo()+ "	" + cont.getHomeNumber());
        }
    }

}
