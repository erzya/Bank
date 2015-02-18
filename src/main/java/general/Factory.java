package general;


import dao.extendDao.ContactDao;
import dao.HibernateDao;
import dao.extendDao.CurrencyDao;
import model.Currency;


public class Factory {

    private static Factory instance = new Factory();
    private ContactDao contactDao;
    private CurrencyDao currencyDao;

    private Factory(){

    }
    public static Factory getInstance(){
        return Factory.instance;
    }

    public HibernateDao getContactDao(){

        if(contactDao == null)
            contactDao = new ContactDao();
        return contactDao;
    }

    public HibernateDao getCurrencyDao(){
        if(currencyDao == null)
            currencyDao = new CurrencyDao();
        return currencyDao;
    }
}
