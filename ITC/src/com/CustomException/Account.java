package com.CustomException;

import java.io.Serializable;
import java.lang.reflect.Array;

public class Account implements Serializable{
	
	//static final long serialVersionUID=134354556565L;
	
	
  int balance=100;
  static int min_balance=150;
  transient String name="Teja IT";
  
public void balanceCheck() {
	if(balance>min_balance) {
		System.out.println("please allow him/her");
		}else {
			throw new InsufficientBalanceException("min balance required 150/-");
		}
}
	
	public static void main(String[] args){
	Account a=new Account();
	a.balanceCheck();
	}

}
