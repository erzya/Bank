package general;

import dao.ContactDao;
import dao.implement.ContactDaoImpl;

/**
 * Created by Nikolai on 13.02.2015.
 */
public class Factory {

    private static Factory instance = new Factory();
    private ContactDao contactDao;

    private Factory(){

    }
    public static Factory getInstance(){
        return Factory.instance;
    }

    public ContactDao getContactDao(){
        if(contactDao == null)
            contactDao = new ContactDaoImpl();
        return contactDao;
    }
}
