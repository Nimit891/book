package com.cts.bookEShopping.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="login")
@Table(name = "login_table")
public class login {
	@Id
	@Column(name = "emailId")
	private String emailId;
	@Column(name = "password")
	private String password;

}
