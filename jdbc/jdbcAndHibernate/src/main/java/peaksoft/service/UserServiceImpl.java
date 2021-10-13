package peaksoft.service;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import peaksoft.dao.UserDaoHibernateImpl;
//import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;
import peaksoft.util.Util;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl extends Util implements UserService {
//
    String name;
    String lastName;
    byte age;

    @Override
    public void createUsersTable() throws SQLException {

    }

    @Override
    public void dropUsersTable() throws SQLException{
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) throws SQLException {


    }

    public void removeUserById(long id) throws SQLException{
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException{

        return null;

    }

    public void cleanUsersTable() throws SQLException{

    }
}
