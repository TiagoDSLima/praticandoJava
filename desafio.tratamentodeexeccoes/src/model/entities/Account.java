package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
		if(number <= 0) {
			throw new DomainException("Invalid account number!");
		} else if(balance < 0) {
			throw new DomainException("Invalid balance!");
		} else if(withdrawLimit < 0) {
			throw new DomainException("Invalid withdraw limit!");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double value) throws DomainException {
		if(value <= 0) {
			throw new DomainException("Invalid value!");
		}
		balance += value;
	}
	
	public void withdraw(Double value) throws DomainException {
		if(value <= 0) {
			throw new DomainException("Invalid value!");
		} else if(value > withdrawLimit) {
			throw new DomainException("Amount reported above the withdraw limit!");
		} else if(value > balance) {
			throw new DomainException("Amount reported above the account balance!");
		}
		balance -= value;
	}
	
	public Double getBalance() {
		return balance;
	}
}
