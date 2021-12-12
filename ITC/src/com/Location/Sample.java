package com.Location;

public class Sample {

	public static void main(String[] args) {
		String s="teja";
		s="ch";
		System.out.println(s);
		String s1=new String("teja");
		//s1.intern();
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	String s2="teja";
	System.out.println(s.equals(s2));
	System.out.println(s==s2);
	
	String s3=new String("teja");
	System.out.println(s1.equals(s3));
	System.out.println(s1==s3);
	System.gc();
	char c='A';
	int cascci=c;
	System.out.println(cascci);

	}

}
