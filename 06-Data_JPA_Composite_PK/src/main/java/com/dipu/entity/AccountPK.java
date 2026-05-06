package com.dipu.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

/**
 * This class represents/Allows only Primary Key Data Table
 * @Embeddable annotation represents only Primary Key Table
 */
/**
 * If we have to use more  than one PK than implements Serializable,
 * otherwise sometimes got error like 
 * MappingException: Composite-id class must implement Serializable
 */

@Embeddable
public class AccountPK implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer accountId;
	private String accountType;
	private Long accountNumber;
	
	public AccountPK() {
		
	}
	
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		return "AccountPK [accountId=" + accountId + ", accountType=" + accountType + ", accountNumber=" + accountNumber
				+ "]";
	}
	public AccountPK(Integer accountId, String accountType, Long accountNumber) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
	}
	
	
	
	
}
