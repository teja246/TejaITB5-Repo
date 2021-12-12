package com.Location;

public class India {	
	
	String capitalofAp;//amaravathi
	long pinCode;
 String majorCity="Guntur";
	
	public India(String capitalofAp) {
		this.capitalofAp = capitalofAp;	
	}
	
	public India(long pin) {
		this.pinCode=pin;
	}

	public void andhraPradesh() {
		String majorCity="vizag";
		System.out.println(" capital is "+capitalofAp+"  "+pinCode+"  "+majorCity);
	}

	public static void main(String[] args) {
		India i=new India("Amaravathi");
		i.andhraPradesh();
		India i1=new India(522409);
		i1.andhraPradesh();
		
	
		
		
	
		
	}
  }
