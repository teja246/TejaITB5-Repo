package com.CustomException;

public class Balance implements Cloneable{

	
	public void amount() {
		System.out.println("amount method");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Balance b=new Balance();
		b.amount();
		Balance b1=(Balance) b.clone();
		b1.amount();
	}

}
