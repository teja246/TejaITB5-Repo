package com.CustomException;

public class Teja{

	public void m1() {
		System.out.println("m1 method");
	}
	
public static void main(String[] args) {
	Teja t=new Teja();
	t.m1();
	try {
		Teja t1=(Teja) t.clone();
		t1.m1();
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
}

}
