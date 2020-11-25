package edu3;

import java.util.Date;
public class Account16 {
	private int id=0;
	private double balance=0;
	private static double yearInterestRate=0;
	private Date dateCreated = new Date();
	
	Account16(){
	}
	
	Account16(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	
	void setId(int id) {
		this.id=id;
	}
	void setBalance(double balance) {
		this.balance=balance;
	}
	static void setYearInterestRate(double yir) {
		yearInterestRate=yir;
	}
	int getId() {
		return id;
	}
	double getBalance() {
		return balance;
	}
	double getYIR() {
		return yearInterestRate;
	}
	String getDate() {
		return dateCreated.toString();
	}
	
	static double getMonthlyInterestRate() {
		return yearInterestRate/12;
	}
	double getMonthlyInterest() {
		return balance*yearInterestRate/(12*100);
	}
	void withdraw(double sum) {
		if(balance<sum) {
			System.out.println("Error");
		}else if(sum<0) {
			System.out.println("Error");
		}else {
			balance = balance-sum;
		}
	}
	void deposit(double sum) {
		balance=balance+sum;
	}
}

