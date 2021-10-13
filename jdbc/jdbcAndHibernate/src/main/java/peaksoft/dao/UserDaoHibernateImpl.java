package peaksoft.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import peaksoft.model.User;
import peaksoft.util.Util;

import java.util.List;

public class UserDaoHibernateImpl extends Util implements UserDao{
    private Transaction transaction = null;

    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {

    }

    public void dropUsersTable() {
        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            session.createSQLQuery("DROP TABLE users").executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted table users");
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }


    public void saveUser(String name, String lastName, byte age) {
        Long userId;
        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            User user = new User(name, lastName, age);
            userId = (Long) session.save(user);
            session.getTransaction().commit();
            session.close();
            System.out.println(userId + " is added!");
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeUserById(long id) {
        try {
            Session session = Util.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            User e = (User) session.get(User.class, id);
            session.delete(e);
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted" + e);
        } catch (
                Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = null;
        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            userList = session.createQuery("FROM User ").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Found " + userList.size() + " users");

        } catch (
                Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return userList;
    }


    public void cleanUsersTable() {
        try {
            Session session = Util.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.createQuery("DELETE FROM User").executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Successfully deleted all data in User");

        } catch (
                Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
