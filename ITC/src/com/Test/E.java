package com.Test;

public class E implements Cloneable{

	public void m1() {
		System.out.println("m1 method");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		E e=new E();
		E e1=(E) e.clone();
		e1.m1();

	}

   }
