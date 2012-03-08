package com.jsfsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class Person {
	
	private Integer accountId;
	private Role currentRole;
	private String login;
	private String password;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="account_id")
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	@ManyToOne
	@JoinColumn(name="role_id")	
	public Role getCurrentRole() {
		return currentRole;
	}
	public void setCurrentRole(Role currentRole) {
		this.currentRole = currentRole;
	}
	
	@Column(name="login")
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
