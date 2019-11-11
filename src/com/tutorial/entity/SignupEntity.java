package com.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="SignupEntity.getAllUsers",query="SELECT u from SignupEntity u")
@Table(name = "users")
public class SignupEntity {

	@Id
	@Column(name="username")
	private String username;
	
	public SignupEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column(name="password")
	  private String password;
	@Column(name="firstname")
	  private String firstname;
	@Override
	public String toString() {
		return "TutorialEntity [username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", phone=" + phone + "]";
	}
	@Column(name="lastname")
	  private String lastname;
	@Column(name="email")
	  private String email;
	@Column(name="address")
	  private String address;
	@Column(name="phone")
	  private int phone;
	  public String getUsername() {
	  return username;
	  }
	  public void setUsername(String username) {
	  this.username = username;
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
