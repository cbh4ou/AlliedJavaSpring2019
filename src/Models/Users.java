package Models;

public class Users {
    
    private static String currentUser;
    private int id;
    private String userid;
    private String email;
    private String password;
    private String role;
    private int phone;
    private String firstName;
    private String lastName;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String welcomeString(){
        if(getRole().equals("Doctor")){
            return "Welcome, " + "Dr." +  " " + getLastName();
        }
        if(getRole().equals("Admin")){
            return "Welcome, " + "Admin" +  " " + getLastName();
        }
        return "Welcome Receptionist, " + getFirstName() +  " " + getLastName();
    }
    
    public static String getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(String currentUser) {
        Users.currentUser = currentUser;
    }
        
    public static int getUserCount(){
      return 0;
    }
    
}