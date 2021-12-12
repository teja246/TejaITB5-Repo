package com.Sample;

import java.sql.Array;

public class BirlaProducts {

	public static void main(String[] args) {
		String [] birla_products= {"ultraTech cement","Birla IT","Pantaloons Fashoins"};
		String[] birla=new String[4];
		birla[0]="ultratech";
		
	System.out.println(birla_products[0]);
	System.out.println(birla_products[1]);
	System.out.println(birla_products[2]);
	
	for(int i=0;i<birla_products.length;i++) {
		System.out.println(birla_products[i]);
	}
	}

}
