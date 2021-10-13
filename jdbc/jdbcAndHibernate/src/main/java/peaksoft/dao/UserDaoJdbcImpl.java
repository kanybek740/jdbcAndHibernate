//package peaksoft.dao;
//
//import peaksoft.model.User;
//import peaksoft.util.Util;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//import static peaksoft.util.Util.connect;
//
//public class UserDaoJdbcImpl extends Util implements UserDao {
//
//
//
//    public UserDaoJdbcImpl() {
//
//    }
//
//    @Override
//    public void createUsersTable() {
//        String createTable = "CREATE TABLE IF NOT EXISTS users " +
//                "(id SERIAL PRIMARY KEY ," +
//                " name VARCHAR(40), " +
//                " lastName VARCHAR(50), " +
//                " age smallint )";
//        try {
//            Connection conn = connect();
//            Statement statement = conn.createStatement();
//            statement.execute(createTable);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public void dropUsersTable() {
//        String dropUsersTable = "DROP TABLE IF EXISTS users";
//        try {
//            Connection conn = connect();
//            Statement statement = conn.createStatement();
//            statement.execute(dropUsersTable);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//        String Sql = "INSERT INTO users (name, lastName, age) " + "VALUES (?, ?, ?)";
//        try {
//            Connection conn = connect();
//            PreparedStatement statement = conn.prepareStatement(Sql, Statement.RETURN_GENERATED_KEYS);
//            statement.setString(1, name);
//            statement.setString(2, lastName);
//            statement.setByte(3, age);
//            statement.executeUpdate();
//            System.out.println(name + " successfully added!!!");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//    }
//
//    public void removeUserById(long id) {
//        try {
//            Connection conn = connect();
//            PreparedStatement statement = conn.prepareStatement("delete from users where id = ?");
//            statement.setLong(1, id);
//            statement.executeUpdate();
//            System.out.println("user successfully deleted");
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//
//    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<User>();
//        try {
//            Connection conn = connect();
//
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from users");
//            while (rs.next()) {
//                User user = new User();
//                user.setId(rs.getLong("id"));
//                user.setName(rs.getString("name"));
//                user.setLastName(rs.getString("lastName"));
//                user.setAge(rs.getByte("age"));
//
//                users.add(user);
//            }
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//        return users;
//    }
//
//    public void cleanUsersTable() {
//        try {
//            Connection conn = connect();
//            Statement statement = conn.createStatement();
//            statement.execute("TRUNCATE users CASCADE");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
