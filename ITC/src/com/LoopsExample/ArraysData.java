package com.LoopsExample;

public class ArraysData {
	String[] names= {"teja","anand","ramanji","samba"};
	
	String s="Teja IT";

	
	public void arrayData() {
	
		/*
		 * for(int i=0;i<=names.length-1;i++) {
		 * 
		 * }
		 */
	
	//for each
	for(String val:names) {
		System.out.println(val);
	}

	}
	
	public static void main(String[] args) {		
		ArraysData arr=new ArraysData();
		arr.arrayData();	
	}

}
