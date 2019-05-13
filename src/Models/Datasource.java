package Models;


import java.sql.*;
import java.util.*;



public class Datasource {

    public static final String DB_NAME = "persondev.db";

    public static final String CONNECTION_STRING = "jdbc:sqlite:src/Database/" + DB_NAME;

    public static final String TABLE_USERS= "users";
    public static final String COLUMN_USER_ID = "_id";
    public static final String COLUMN_USER_USERID = "userid";
    public static final String COLUMN_USER_EMAIL = "email";
    public static final String COLUMN_USER_PASSWORD = "password";
    public static final String COLUMN_USER_ROLE = "role";
    public static final String COLUMN_USER_PHONE = "phone";
    public static final String COLUMN_USER_LASTNAME = "lastName";
    public static final String COLUMN_USER_FIRSTNAME = "firstName";
    
    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch(SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch(SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public String loginUsers(String pass, String loginId) throws SQLException {
        
        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_USERS)) {

            List<Users> users = new ArrayList<>();
            while(results.next()) {
              Users user = new Users();
                user.setId(results.getInt(COLUMN_USER_ID));
                user.setUserid(results.getString(COLUMN_USER_USERID));
                user.setPassword(results.getString(COLUMN_USER_PASSWORD));
                user.setRole(results.getString(COLUMN_USER_ROLE));
                user.setEmail(results.getString(COLUMN_USER_EMAIL));
                user.setFirstName(results.getString(COLUMN_USER_FIRSTNAME));
                user.setLastName(results.getString(COLUMN_USER_LASTNAME));
                user.setPhone(results.getInt(COLUMN_USER_PHONE));
                users.add(user);
            }


        for(Users user : users) {
            if(user.getPassword().equals(pass) && user.getUserid().equals(loginId)){
                System.out.println("Password Right! User: " + user.getUserid() + " is logged in!" );
                Users.setCurrentUser(loginId);
                return user.getRole();
            }
            else {
                 System.out.println("no match");
            }
        }
            return null;

        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }
    public Users queryUser(String loginId) throws SQLException {
        
        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_USERS)) {

            List<Users> users = new ArrayList<>();
            while(results.next()) {
              Users user = new Users();
                user.setId(results.getInt(COLUMN_USER_ID));
                user.setUserid(results.getString(COLUMN_USER_USERID));
                user.setPassword(results.getString(COLUMN_USER_PASSWORD));
                user.setRole(results.getString(COLUMN_USER_ROLE));
                user.setEmail(results.getString(COLUMN_USER_EMAIL));
                user.setFirstName(results.getString(COLUMN_USER_FIRSTNAME));
                user.setLastName(results.getString(COLUMN_USER_LASTNAME));
                user.setPhone(results.getInt(COLUMN_USER_PHONE));
                users.add(user);
            }


        for(Users user : users) {
            if(user.getUserid().equals(loginId)){
                System.out.println(Users.getCurrentUser() + "is logged in!");
                return user;
            }
            else {
                 System.out.println("no one is logged in? BRO!?");
            }
        }
            return null;

        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }
     public String insertUser(String pass, String loginId) throws SQLException {
        
        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_USERS)) {

            List<Users> users = new ArrayList<>();
            while(results.next()) {
              Users user = new Users();
                user.setUserid(results.getString(COLUMN_USER_USERID));
                user.setPassword(results.getString(COLUMN_USER_PASSWORD));
                user.setRole(results.getString(COLUMN_USER_ROLE));
                
                users.add(user);
            }


        for(Users user : users) {
            if(user.getPassword().equals(pass) && user.getUserid().equals(loginId)){
                System.out.println("Password Right, BRO!");
                return user.getRole();
            }
            else {
                 System.out.println("no match");
            }
        }
            return null;

        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }
}