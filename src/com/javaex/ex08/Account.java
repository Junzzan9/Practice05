package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    private int deposit;
    private int withdraw;
    
    //생성자 작성
    
    public Account(String accountNo) {
    	this.accountNo=accountNo;
    	
    }

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
    
    
    //필요한 메소드 작성
	
	public void deposit(int deposit){
		this.deposit=deposit;
		this.balance=this.deposit+this.balance;
	}
	
	public void withdraw(int withdraw) {
		this.withdraw=withdraw;
		this.balance=this.balance-this.withdraw;
	}
	
	public void showBalance () {
    	System.out.println(balance);
    }
	
}
