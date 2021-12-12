package com.Goods;

public class Mobiles {

	byte id;
	int sno;
	short code;
	long salary;
	
	double amount;
	float tax;
	
	char grade;
	boolean isGood;
	
	String name;
	
	
	public void data() {
		System.out.println("id is..  "+id);
		System.out.println("sno.. "+sno);
		System.out.println("code.. "+code);
		System.out.println("salary.. "+salary);
		
		
		System.out.println("amount .. "+amount);
		System.out.println("tax ..  "+tax);
		
		System.out.println("grade.."+grade);
		
		System.out.println("is good.. "+isGood);
		
		System.out.println("name is.. "+name);
	}
	
	public static void main(String[] args) {
		Mobiles mob=new Mobiles();
		mob.data();
	}
}
