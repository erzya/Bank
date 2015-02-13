package dao.implement;

import dao.ContactDao;
import model.Contact;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Nikolai on 13.02.2015.
 */

public class ContactDaoImpl implements ContactDao {

    @Override
    public void addContact(Contact contact) throws SQLException {
        Session session= null;
        try{
            // System.out.println("1");
            session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
            session.save(contact);
            session.getTransaction().commit();
        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteContact(Contact contact) throws SQLException {
        Session session= null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(contact);
            session.getTransaction().commit();
        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }

    }

    @Override
    public Contact getContact(int id) throws SQLException {
        Contact result = null;

        Session session= null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Contact) session.load(Contact.class, id);

        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }
        return result;
    }

    @Override
    public List<Contact> getContacts() {
        List<Contact> resultList = null;
        Session session= null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            resultList =  session.createCriteria(Contact.class).list();

        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }

        return resultList;
    }
}
