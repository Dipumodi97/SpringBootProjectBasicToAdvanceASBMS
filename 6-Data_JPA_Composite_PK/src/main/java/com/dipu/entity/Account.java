package com.dipu.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {

	private String holderName;
	private String branch;
	
	@EmbeddedId
	private AccountPK accountPK;
	
	public Account() {
		
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public AccountPK getAccountPK() {
		return accountPK;
	}

	public void setAccountPK(AccountPK accountPK) {
		this.accountPK = accountPK;
	}

	public Account(String holderName, String branch, AccountPK accountPK) {
		super();
		this.holderName = holderName;
		this.branch = branch;
		this.accountPK = accountPK;
	}

	@Override
	public String toString() {
		return "Account [holderName=" + holderName + ", branch=" + branch + ", accountPK=" + accountPK + "]";
	}
	
	
	
}
