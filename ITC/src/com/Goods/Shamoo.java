package com.Goods;

public class Shamoo {

	byte sno=1;
	short sizehorizontal=120;
	short sizeVertical=150;
	int quantityInML=1000;
	long products=999999999;
	double price=2.55;
	float cost=2.35f;
	char shampooCode='A';
	boolean isitGood=true;
	String productName="Clinic Plus";
	
	static String productOwner="Ambani";
	
	public static void main(String[] args) {
		
	Shamoo sh=new Shamoo();
	System.out.println(sh.price);
	System.out.println(Shamoo.productOwner);
	int id=120;
	System.out.println(id);
	}
  }
   
