package com.prk.banking_app.dto;


public class AccountDto 
{
	public AccountDto(long id, String accountHolderName, double balance) 
	{
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	private long id;
	private String accountHolderName;
	private double balance;
	public long getId() {
		return id;
	}
	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
