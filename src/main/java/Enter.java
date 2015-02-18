
import dao.HibernateDao;
import general.Factory;
import model.Contact;
import model.Currency;

import java.sql.SQLException;
import java.util.List;


public class Enter {

    public static void main(String[] args) throws SQLException {

        Factory factory = Factory.getInstance();
        HibernateDao contactDao = factory.getContactDao();
        HibernateDao currencyDao = factory.getCurrencyDao();

     /* contactDao.delete(contactDao.findOne(1));
      contactDao.delete(contactDao.findOne(2));
      contactDao.delete(contactDao.findOne(3));*/

    /*    currencyDao.add(new Currency("dollar", 15));
        currencyDao.add(new Currency("euro", 25));
        currencyDao.add(new Currency("eurouykyu", 45));*/



  /*  System.out.println(contactDao.findOne(3));
        System.out.println(currencyDao.findOne(1));*/


        /*contactDao.add(new Contact("23453", "second", "gfdda"));

        contactDao.add(new Contact("23", "423", "fgfdg2"));
        contactDao.add(new Contact("31", "ond", "ghjliua3"));*/


        /*List<Contact> list =  contactDao.findAll();
        System.out.println(list.size());

        System.out.println("id		email		mobile1		mobile2		homenumber");
        for(Contact cont: list){
            System.out.println(cont.getId() + "     	" + cont.getEmail() + "		" + cont.getMobileOne()
                    + "	" + cont.getMobileTwo()+ "	" + cont.getHomeNumber());
        }*/

    }

}
