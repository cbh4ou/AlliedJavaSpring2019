package Models;



import Frames.adminFrame;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Datasource {

   public static final String DB_NAME = "persondev.db";

    public static final String CONNECTION_STRING = "jdbc:sqlite:src/Database/" + DB_NAME;

    public static final String TABLE_USERS= "users";
    public static final String TABLE_PATIENTS= "patients";
    public static final String COLUMN_USER_ID = "_id";
    public static final String COLUMN_USER_USERID = "userid";
    public static final String COLUMN_USER_EMAIL = "email";
    public static final String COLUMN_USER_PASSWORD = "password";
    public static final String COLUMN_USER_ROLE = "role";
    public static final String COLUMN_USER_PHONE = "phone";
    public static final String COLUMN_USER_LASTNAME = "lastName";
    public static final String COLUMN_USER_FIRSTNAME = "firstName";
    public static final String COLUMN_USER_SCHEDULE = "schedule";
    
    public static final String COLUMN_PATIENT_LASTNAME = "plastName";
    public static final String COLUMN_PATIENT_FIRSTNAME = "pfirstName";
    public static final String COLUMN_PATIENT_STATUS = "pstatus";
    public static final String COLUMN_PATIENT_APPOINTMENT = "papt";
    public static final String COLUMN_PATIENT_ID = "_pid";
    public static final String COLUMN_PATIENT_PHONE = "pphone";
    public static final String COLUMN_PATIENT_EMAIL = "pemail";
    public static final String COLUMN_PATIENT_DOB = "pdob";
    public static final String COLUMN_PATIENT_STREET_ADDRESS = "pstrAdd";
    public static final String COLUMN_PATIENT_CITY = "pcity";
    public static final String COLUMN_PATIENT_STATE = "pstate";
    public static final String COLUMN_PATIENT_SOCIAL = "psocial";
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
                user.setSchedule(results.getString(COLUMN_USER_SCHEDULE));     
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
     
     public void updateETable(int _id, String firstName, String lastName, String phone, String email, String schedule ) {
         System.out.println("bruh");
        String sql = "UPDATE users SET firstName = ?, lastName = ?, phone = ?, email = ?, schedule = ? "
                + "WHERE _id = ?";
        
        try {
            System.out.println("bruh2");
              PreparedStatement pstmt = conn.prepareStatement(sql);
            // set the corresponding param
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, phone);
            pstmt.setString(4, email);
            pstmt.setString(5, schedule);
            pstmt.setInt(6, _id);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
       public ArrayList<Users> querySTable() throws SQLException {      
        
             String sql = " SELECT _id, role , firstName, lastName, schedule";
           try{ Statement statement = conn.createStatement();
                ResultSet results = statement.executeQuery(sql + " FROM " + TABLE_USERS);
    
                ArrayList<Users> users = new ArrayList<>();
                while(results.next()) {
                  Users user = new Users();
                    user.setId(results.getInt(COLUMN_USER_ID));
                    user.setRole(results.getString(COLUMN_USER_ROLE));
                    user.setLastName(results.getString(COLUMN_USER_LASTNAME));
                    user.setFirstName(results.getString(COLUMN_USER_FIRSTNAME));                    
                    user.setSchedule(results.getString(COLUMN_USER_SCHEDULE));
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
       public ArrayList<Patients> queryPTable(int doctorID) throws SQLException {      
		
        String sql = " SELECT _pid, pfirstName, plastName, pphone, pemail, papt FROM patients WHERE pdoctor = " + Integer.toString(doctorID);
      try{ Statement statement = conn.createStatement();
           ResultSet results = statement.executeQuery(sql);

           ArrayList<Patients> patients = new ArrayList<>();
           while(results.next()) {
             Patients patient = new Patients();
               patient.setPId(results.getInt(COLUMN_PATIENT_ID));
               patient.setPFirstName(results.getString(COLUMN_PATIENT_FIRSTNAME));	 
               patient.setPLastName(results.getString(COLUMN_PATIENT_LASTNAME));               
               patient.setPPhone(results.getString(COLUMN_PATIENT_PHONE));        
               patient.setPEmail(results.getString(COLUMN_PATIENT_EMAIL));
               patient.setPApt(results.getString(COLUMN_PATIENT_APPOINTMENT));
               patients.add(patient);
           }
           return patients;
      } catch(SQLException | NullPointerException e) {
           System.out.println("Query failed: " + e.getMessage());         
       }
      return null;
    }  
        public ArrayList<Patients> queryPRTable() throws SQLException {      
		
        String sql = " SELECT _pid, pfirstName, plastName, papt FROM patients";
      try{ Statement statement = conn.createStatement();
           ResultSet results = statement.executeQuery(sql);

           ArrayList<Patients> patients = new ArrayList<>();
           while(results.next()) {
             Patients patient = new Patients();
               patient.setPId(results.getInt(COLUMN_PATIENT_ID));
               patient.setPFirstName(results.getString(COLUMN_PATIENT_FIRSTNAME));	 
               patient.setPLastName(results.getString(COLUMN_PATIENT_LASTNAME));               
               patient.setPApt(results.getString(COLUMN_PATIENT_APPOINTMENT));
               patients.add(patient);
           }
           return patients;
      } catch(SQLException | NullPointerException e) {
           System.out.println("Query failed: " + e.getMessage());         
       }
      return null;
    }  
	
	public ArrayList<Patients> queryDPSTable() throws SQLException {      
			
	        String sql = " SELECT __pid, pfirstName, plastName, pphone, pemail";
	      try{ Statement statement = conn.createStatement();
	           ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_PATIENTS);
	
	           ArrayList<Patients> patients = new ArrayList<>();
	           while(results.next()) {
	        	   Patients patient = new Patients();
	               patient.setPId(results.getInt(COLUMN_PATIENT_ID));
	               patient.setPLastName(results.getString(COLUMN_PATIENT_LASTNAME));
	               patient.setPFirstName(results.getString(COLUMN_PATIENT_FIRSTNAME));	 
	               patient.setPPhone(results.getString(COLUMN_PATIENT_PHONE));        
	               patient.setPEmail(results.getString(COLUMN_PATIENT_EMAIL));
	               patients.add(patient);
	           }
	           return patients;
	      } catch(SQLException e) {
	           System.out.println("Query failed: " + e.getMessage());         
	       } catch (NullPointerException e){
	           System.out.println("Query failed: " + e.getMessage());
	       }
	      return null;
	    }  
       
	public ArrayList<Patients> queryDPQTable() throws SQLException {      
			
	        String sql = " SELECT __pid, pfirstName, plastName, pstatus";
	      try{ Statement statement = conn.createStatement();
	           ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_PATIENTS);
	
	           ArrayList<Patients> patients = new ArrayList<>();
	           while(results.next()) {
	             Patients patient = new Patients();
	               patient.setPId(results.getInt(COLUMN_PATIENT_ID));
	               patient.setPFirstName(results.getString(COLUMN_PATIENT_FIRSTNAME));	
	               patient.setPLastName(results.getString(COLUMN_PATIENT_LASTNAME));	
	               patient.setPStatus(results.getString(COLUMN_PATIENT_STATUS));  
	               patient.setPApt(results.getString(COLUMN_PATIENT_APPOINTMENT));   
	               patients.add(patient);
	           }
	           return patients;
	      } catch(SQLException e) {
	           System.out.println("Query failed: " + e.getMessage());         
	       } catch (NullPointerException e){
	           System.out.println("Query failed: " + e.getMessage());
	       }
	      return null;
	    }  
	
	public ArrayList<Patients> queryRSATable() throws SQLException {      
		
        String sql = " SELECT __pid, pfirstName, plastName, papt";
      try{ Statement statement = conn.createStatement();
           ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_PATIENTS +"WHERE" + COLUMN_PATIENT_APPOINTMENT + "=null");

           ArrayList<Patients> patients = new ArrayList<>();
           while(results.next()) {
             Patients patient = new Patients();
               patient.setPId(results.getInt(COLUMN_PATIENT_ID));
               patient.setPFirstName(results.getString(COLUMN_PATIENT_FIRSTNAME));	 
               patient.setPLastName(results.getString(COLUMN_PATIENT_LASTNAME));                  
               patient.setPApt(results.getString(COLUMN_PATIENT_APPOINTMENT));
               patients.add(patient);
           }
           return patients;
      } catch(SQLException e) {
           System.out.println("Query failed: " + e.getMessage());         
       } catch (NullPointerException e){
           System.out.println("Query failed: " + e.getMessage());
       }
      return null;
    }  
	
	public ArrayList<Patients> queryRPSTable() throws SQLException {      
			
	        String sql = " SELECT __pid, pfirstName, plastName, pphone, pemail";
	      try{ Statement statement = conn.createStatement();
	           ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_PATIENTS);
	
	           ArrayList<Patients> patients = new ArrayList<>();
	           while(results.next()) {
	             Patients patient = new Patients();
	               patient.setPId(results.getInt(COLUMN_PATIENT_ID));
	               patient.setPFirstName(results.getString(COLUMN_PATIENT_FIRSTNAME));	 
	               patient.setPLastName(results.getString(COLUMN_PATIENT_LASTNAME));                  
	               patient.setPPhone(results.getString(COLUMN_PATIENT_PHONE));
	               patient.setPEmail(results.getString(COLUMN_PATIENT_EMAIL));
	               patients.add(patient);
	           }
	           return patients;
	      } catch(SQLException e) {
	           System.out.println("Query failed: " + e.getMessage());         
	       } catch (NullPointerException e){
	           System.out.println("Query failed: " + e.getMessage());
	       }
	      return null;
	    }  
	
	public void insertPatient(String _pid, String pemail, String pdob, String papt, String pphone,
		     String pfirstName, String plastName, String psocial, String pstatus, String pstate, String pcity, String pstrAdd) throws SQLException {
		         String sql = "INSERT INTO users(_pid, pemail,  pdob,  papt,  pphone" + 
		        		"pfirstName,  plastName,  psocial,  pstatus,  pstate,  pcity,  pstrAdd) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";

		        try {
		            System.out.println("");
		            PreparedStatement pstmt = conn.prepareStatement(sql);
		            pstmt.setString(1, _pid);
		            pstmt.setString(2, pemail);
		            pstmt.setString(3, pdob);
		            pstmt.setString(4, papt);
		            pstmt.setString(5, pphone);
		            pstmt.setString(6, pfirstName);
		            pstmt.setString(7, plastName);
		            pstmt.setString(8, psocial);
		            pstmt.setString(9, pstatus);
		            pstmt.setString(10, pstate);
		            pstmt.setString(11, pcity);
		            pstmt.setString(12, pstrAdd);
		            pstmt.executeUpdate();
		        } catch (SQLException e) {
		            System.out.println(e.getMessage());
		        }

		    }
	
	public void insertStatus(String pstatus) throws SQLException {
		         String sql = "INSERT INTO users(pstatus) VALUES(?);";

		        try {
		            System.out.println("");
		            PreparedStatement pstmt = conn.prepareStatement(sql);		            
		            pstmt.setString(1, pstatus);
		            pstmt.executeUpdate();
		        } catch (SQLException e) {
		            System.out.println(e.getMessage());
		        }

		    }
	
	public void updateStatus(int _pid, String status) {
        String sql = "UPDATE patients SET pstatus = ? "
                + "WHERE _pid = ?";
 
        try (
              PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, status);
            pstmt.setInt(2, _pid);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
        
}
