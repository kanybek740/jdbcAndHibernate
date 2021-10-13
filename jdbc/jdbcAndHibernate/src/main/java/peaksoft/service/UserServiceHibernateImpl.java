package peaksoft.service;

import org.hibernate.Session;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;
import peaksoft.util.Util;

import java.sql.SQLException;
import java.util.List;

public class UserServiceHibernateImpl extends Util implements UserService {


    @Override
    public void createUsersTable() throws SQLException {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
    }

    @Override
    public void dropUsersTable() throws SQLException {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) throws SQLException {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) throws SQLException {
        UserDaoHibernateImpl userServiceHibernate = new UserDaoHibernateImpl();
        userServiceHibernate.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        return userDaoHibernate.getAllUsers();
    }

    @Override
    public void cleanUsersTable() throws SQLException {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.cleanUsersTable();
    }
}
