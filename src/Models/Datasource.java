package Models;



import Frames.adminFrame;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;


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
    public static final String COLUMN_USER_SCHEDULE = "schedule";
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
                user.setPhone(results.getString(COLUMN_USER_PHONE));
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
                user.setPhone(results.getString(COLUMN_USER_PHONE));
                users.add(user);
            }


        for(Users user : users) {
            if(user.getUserid().equals(loginId)){
                System.out.println(Users.getCurrentUser() + "is logged in!");
                return user;
            }
        }
            return null;

        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }
     public void insertUser(String loginId, String email, String pass, String role, String phone,
     String firstName, String lastName, String schedule) throws SQLException {
        String sql = "INSERT INTO users(userid, email, password, role, phone, firstName"
                + ",lastName, schedule) VALUES(?,?,?,?,?,?,?,?);";

        try {
            System.out.println("");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, loginId);
            pstmt.setString(2, email);
            pstmt.setString(3, pass);
            pstmt.setString(4, role);
            pstmt.setString(5, phone);
            pstmt.setString(6, firstName);
            pstmt.setString(7, lastName);
            pstmt.setString(8, schedule);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
     public int userCount() throws SQLException {
        
        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("select count(*) as final from " + TABLE_USERS)) {

            
            while(results.next()) {
                return results.getInt("final");
            }
            } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
       
        }
     
     public int maxID() throws SQLException {
        
        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("select max(_id) as max from " + TABLE_USERS)) {

            
            while(results.next()) {
                return results.getInt("max");
            }
            } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
       
        }
     
   
     public ArrayList<Users> queryETable() throws SQLException {
         
         
         String sql = " SELECT _id, firstName , lastName, phone, email, role  from  users";
       try{ Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_USERS);

            ArrayList<Users> users = new ArrayList<>();
            while(results.next()) {
              Users user = new Users();
                user.setId(results.getInt(COLUMN_USER_ID));
                user.setFirstName(results.getString(COLUMN_USER_FIRSTNAME));
                user.setLastName(results.getString(COLUMN_USER_LASTNAME));
                user.setPhone(results.getString(COLUMN_USER_PHONE));                
                user.setEmail(results.getString(COLUMN_USER_EMAIL));
                user.setRole(results.getString(COLUMN_USER_ROLE));     
                users.add(user);
            }
            return users;
       } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());         
        } catch (NullPointerException e){
            System.out.println("Query failed: " + e.getMessage());
        }
       return null;
     }  
     
       public ArrayList<Users> querySTable() throws SQLException {      
        
             String sql = " SELECT _id, role , firstName, lastName, schedule";
           try{ Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_USERS);
    
                ArrayList<Users> users = new ArrayList<>();
                while(results.next()) {
                  Users user = new Users();
                    user.setId(results.getInt(COLUMN_USER_ID));
                    user.setRole(results.getString(COLUMN_USER_ROLE));
                    user.setLastName(results.getString(COLUMN_USER_LASTNAME));
                    user.setFirstName(results.getString(COLUMN_USER_FIRSTNAME));                    
                    user.setPhone(results.getString(COLUMN_USER_SCHEDULE));
                    users.add(user);
                }
                return users;
           } catch(SQLException e) {
                System.out.println("Query failed: " + e.getMessage());         
            } catch (NullPointerException e){
                System.out.println("Query failed: " + e.getMessage());
            }
           return null;
         }
}
