package Models;

public class Patients {
	
	    private int id;
	    private String email;
	    private String phone;
	    private String firstName;
	    private String lastName;
	    private String status;
	    private String apt;
	    private String dob;
	    private String strAdd;
	    private String city;
	    private String state;
	    private String social;
	    private String doctor;

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
            
	    public String getPPhone() {
	        return phone;
	    }

	    public void setPPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getPFirstName() {
	        return firstName;
	    }

	    public void setPFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getPLastName() {
	        return lastName;
	    }

	    public void setPLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    
	    public int getPId() {
	        return id;
	    }

	    public void setPId(int id) {
	        this.id = id;
	    }

	    public String getPEmail() {
	        return email;
	    }
	    
	    public void setPEmail(String email) {
	        this.email = email;
	    }

	    public String getPStatus() {
	    	return status;
	    }
	   
	    public void setPStatus(String status) {
	    	this.status = status;
	    }
	    
	    public String getPApt() {
	    	return apt;
	    }
	   
	    public void setPApt(String apt) {
	    	this.apt = apt;
	    }
	    
	    public String getpPDob() {
	    	return dob;
	    }
	   
	    public void setPDob(String dob) {
	    	this.dob = dob;
	    }
	    
	    public String getPStrAdd() {
	    	return strAdd;
	    }
	   
	    public void setPStrAdd(String strAdd) {
	    	this.strAdd = strAdd;
	    }
	    
	    public String getPCity() {
	    	return city;
	    }
	   
	    public void setPCity(String city) {
	    	this.city = city;
	    }
	    
	    public String getPState() {
	    	return state;
	    }
	   
	    public void setPState(String state) {
	    	this.state = state;
	    }
	    
	    public String getPSocial() {
	    	return social;
	    }
	   
	    public void setPSocial(String social) {
	    	this.social = social;
	    }
	    public String fullPNameString(){	        
	        return getPFirstName() +  " " + getPLastName();
	    }    
	   
}
