package com.LoopsExample;

public class Amazon {

	
	public int mobileCost() {
		
		return 2356;
	}
	
	
	public static void main(String[] args) {
		
		Amazon amz=new Amazon();
		
		System.out.println(amz.mobileCost());
		
		String s="Teja IT";
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.startsWith("T"));
		System.out.println(s.endsWith("T"));
		System.out.println(s.equals("teja"));
		System.out.println(s.concat("Solutions"));
		System.out.println(s.toLowerCase());
		
		
		
		
		// number types	
		//dataType    variable   value
		byte id=1;
		short sno=250;
		  int  iemi=12345;
		 long  mobileNum=9908746071L;
		 
		 //decimal
		double amount=95.45;
		float mobilecost=200.25f;
		
		char grade='A';
		String mobileName="oppo";
		
		boolean isGood=true;
		
	}
}
