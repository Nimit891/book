package com.cts.bookEShopping.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class userRegistration {
	
	
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "age")
	private String age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "contactNumber")
	private String contactNumber;
	
	@Id
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	 public userRegistration() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "userRegistration [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", password=" + password + "]";
	}
	public userRegistration(String firstName, String lastName, String age, String gender, String contactNumber,
			String emailId, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.password = password;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
