package br.com.fatec.blog.pojo;

public class User {
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String birth;
	private String cell;
	private String emailId;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername (String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void setBirth (String birth) {
		this.birth = birth;
	}
	
	public String getCell() {
		return cell;
	}
	
	public void setCell (String cell) {
		this.cell = cell;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId (String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "User [username = " + username +", password = " 
	+ password + ", firstName = " + firstName + ", lastName = "
	+ lastName + ", birth = " + birth + ", cell = " + cell + 
	", emailId = " + emailId +"]";
	}
	

}
