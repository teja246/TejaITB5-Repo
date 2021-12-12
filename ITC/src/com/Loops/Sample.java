package com.Loops;

public class Sample {

	public void numbers() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}	
	}
	
	public void evenNumbers() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Sample s=new Sample();
		//s.numbers();
		s.evenNumbers();
	}

}
