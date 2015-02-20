package general;


import dao.extendDao.*;
import dao.HibernateDao;
import model.Currency;


public class Factory {

    private static Factory instance = new Factory();
    private ContactDao contactDao;
    private CurrencyDao currencyDao;
    private AccountDao accountDao;
    private MerchantDao merchantDao;
    private TransactionDao transactionDao;

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

    public HibernateDao getAccountDao(){
        if(accountDao == null)
            accountDao = new AccountDao();
        return accountDao;
    }
    public HibernateDao getMerchantDao(){
        if(merchantDao == null)
            merchantDao = new MerchantDao();
        return merchantDao;
    }

    public HibernateDao getTransactionDao(){
        if(transactionDao == null)
            transactionDao = new TransactionDao();
        return transactionDao;
    }
}
