package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
//import peaksoft.dao.UserDaoJdbcImpl;
//import peaksoft.dao.UserDaoJdbcImpl.*;
import peaksoft.dao.UserDaoHibernateImpl.*;
import peaksoft.model.User;
import peaksoft.service.UserServiceHibernateImpl;
import peaksoft.service.UserServiceImpl;
import peaksoft.service.UserServiceImpl.*;
import peaksoft.util.Util;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

//        User user1 = new User("Azat", "Anarbai", (byte) 32);

//        UserServiceImpl userService = new UserServiceImpl();
//        userService.dropUsersTable();

//        UserServiceHibernateImpl userServiceHibernate = new UserServiceHibernateImpl();
//        userServiceHibernate.saveUser("Aizhan", "Atyrova", (byte) 24);
//        userServiceHibernate.saveUser("Aibek", "Baratov", (byte) 34);
//        userServiceHibernate.saveUser("Azamat", "Altay", (byte) 33);

        UserServiceHibernateImpl userServiceHibernate = new UserServiceHibernateImpl();
        userServiceHibernate.removeUserById(2);
//        userServiceHibernate.getAllUsers();
//        userServiceHibernate.cleanUsersTable();

//        UserServiceHibernateImpl userServiceHibernate = new UserServiceHibernateImpl();
//        userServiceHibernate.createUsersTable();

        Util.shutDown();





    }
}
