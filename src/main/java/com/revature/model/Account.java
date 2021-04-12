package com.revature.model;

public class Account {
	
	private int accNumber;
	private float accBalance;

	public Account() {
		super();
	}
	
	public Account(Client client, float accBalance) {
		this.accNumber = client.getClientNumber();
		this.accBalance = accBalance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(accBalance);
		result = prime * result + accNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Float.floatToIntBits(accBalance) != Float.floatToIntBits(other.accBalance))
			return false;
		if (accNumber != other.accNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", accBalance=" + accBalance + "]";
	}
	
	
}
