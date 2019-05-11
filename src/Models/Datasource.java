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

    public boolean loginUsers(String pass, String loginId) {

        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_USERS)) {

            List<Users> users = new ArrayList<>();
            while(results.next()) {
              Users user = new Users();
                user.setUserid(results.getString(COLUMN_USER_USERID));
                user.setPassword(results.getString(COLUMN_USER_PASSWORD));
                users.add(user);
            }


        for(Users user : users) {
            if(user.getPassword().equals(pass) && user.getUserid().equals(loginId)){
                System.out.println("Password Right, BRO!");
                return true;
            }
        }
            return false;

        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return false;
        }

    }
}