package com.AcessModifier;

 public class A {
	protected int acsess_id=10;
	protected void shop() {
		System.out.println("A class shop method");
	}
	public static void main(String[] args) {
	A a=new A();
	System.out.println(a.acsess_id);
	a.shop();
	}
}
