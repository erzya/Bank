package dao;


import org.hibernate.Session;
import util.HibernateUtil;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;

public class HibernateDao<T extends Serializable> {
    private Class<T> clazz;
    Session session;

    public HibernateDao(){

            clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                    .getActualTypeArguments()[0];

    }


    public void add(T generic) throws SQLException {

        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(generic);
            session.getTransaction().commit();
        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }
    }

    public void delete(T generic) throws SQLException {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(generic);
            session.flush();
            session.getTransaction().commit();

        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }

    }


    public void deleteById(int id) throws SQLException {

        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            T result = (T) session.get(clazz, id);
            session.delete(result);
            session.flush();
            session.getTransaction().commit();

        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }

    }

    public void update(T generic){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(generic);
            session.getTransaction().commit();

        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }

    }

    public T findOne(int id) throws SQLException {
        T result = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            result = (T) session.get(clazz, id);
            session.getTransaction().commit();

        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }

        return result;
    }

    public List<T> findAll() throws SQLException {
        List<T> resultList = null;
        try{
            System.out.println(clazz);
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            resultList = session.createCriteria(clazz).list();
            session.getTransaction().commit();


        } catch(Exception e){
            e.printStackTrace();

        }finally {
            if((session!= null)&& (session.isOpen()))
                session.close();
        }
        return resultList;
    }

}
