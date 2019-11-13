package com.tutorial.model;

import javax.validation.constraints.Size;

public class SignupModel {
	private String username;
	
	@Size(min=1, max=6,message="Password should be alteast 6 digit")
	  private String password;
	  private String firstname;
	  private String lastname;
	  private String email;
	  private String address;
	  private int phone;
	  public String getUsername() {
	  return username;
	  }
	  public void setUsername(String username) {
	  this.username = username;
	  }
	  @Override
	public String toString() {
		return "TutorialModel [username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", phone=" + phone + "]";
	}
	public String getPassword() {
	  return password;
	  }
	  public void setPassword(String password) {
	  this.password = password;
	  }
	  public String getFirstname() {
	  return firstname;
	  }
	  public void setFirstname(String firstname) {
	  this.firstname = firstname;
	  }
	  public String getLastname() {
	  return lastname;
	  }
	  public void setLastname(String lastname) {
	  this.lastname = lastname;
	  }
	  public String getEmail() {
	  return email;
	  }
	public void setEmail(String email) {
	  this.email = email;
	  }
	  public String getAddress() {
	  return address;
	  }
	  public void setAddress(String address) {
	  this.address = address;
	  }
	  public int getPhone() {
	  return phone;
	  }
	  public void setPhone(int phone) {
	  this.phone = phone;
	  }
}
