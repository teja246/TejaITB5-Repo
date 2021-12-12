package com.Goods;

public class Flipkart {
       String name;//instance vraible
	public void electroics() {
	String code;// local variable
	       name="Anand";
	code="ELC";
	System.out.println("categeory code.. "+code);
	System.out.println("parchsing person.."+name);
	System.out.println("brand.."+Brand.brandName);
	}	
	public void computers() {
		String catCode="com";
		name="kranthi";		
		System.out.println("catagery code.. "+catCode);
		System.out.println("purchasing person.."+name);
	}	
	public static void main(String[] args) {
		Flipkart fk=new Flipkart();
		fk.electroics();
		fk.computers();
	}

}
