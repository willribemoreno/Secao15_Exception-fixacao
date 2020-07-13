package model.entities;

import model.exceptions.AllExceptions;

public class Account {
	
	private Integer accountNumber;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer accountNumber, String holder, Double balance, Double withdrawLimit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws AllExceptions {
		if (balance <= 0 || amount > balance) {
			throw new AllExceptions("Not enough balance!");
		}		
		else if (amount > withdrawLimit){
			throw new AllExceptions("You exceed your withdawLimit!");
		}
		else {
			balance -= amount;
		}			
	}
	
	@Override
	public String toString() {
		return "New balance: "
				+ String.format("%.2f", balance);
	}

}
