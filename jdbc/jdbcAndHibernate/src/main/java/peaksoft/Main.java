package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.dao.UserDaoJdbcImpl.*;
import peaksoft.model.User;
import peaksoft.service.UserServiceImpl;
import peaksoft.service.UserServiceImpl.*;
import peaksoft.util.Util;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
//        UserServiceImpl user = new UserServiceImpl();

//        userServiceImpl.createUsersTable();
//        userServiceImpl.dropUsersTable();

//        userServiceImpl.saveUser("Arstan", "Naymanov", (byte) 29);
//        userServiceImpl.saveUser("Atai", "Omurzakov", (byte) 34);
//        userServiceImpl.saveUser("Sezim", "Aterek", (byte) 20);

//        userServiceImpl.removeUserById(3);

//        List<User> users = userServiceImpl.getAllUsers();
//        for(User user : users) {
//            System.out.println(user.getId()+" - "+user.getName()+" - "+user.getLastName()+" - "+user.getAge());
//        }
        userServiceImpl.cleanUsersTable();
    }
}
