package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_accounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private Long id;
	
	@OneToOne
	@MapsId
	private AccountDetail accountDetails;

	
	@Column(name="account_name")
	private String name;
	
	@Column(name="account_password")
	private String password;
	

	public Account() {
	}


	public Account(AccountDetail accountDetails, String name, String password) {
		this.name = name;
		this.password = password;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountDetail getAccountDetails() {
		return accountDetails;
	}


	public void setAccountDetails(AccountDetail accountDetails) {
		this.accountDetails = accountDetails;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
