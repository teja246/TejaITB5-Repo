package com.LoopsExample;

public class Loop {

	public void numbers() {
	for(int i=1; i<=10;i++) {
		System.out.print(i);
	}
	}
	public void swapping() {
	int a=10;
	int b=20;
	 a=a+b;
	 b=a-b;//10
	 a=a-b;//20
	 System.out.println("A="+a+"  b="+b);
	}
	
	public void evenNumbers() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i);
			}	
		}
	}
		
	public static void main(String[] args) {
			Loop l=new Loop();
			//l.numbers();
			//l.evenNumbers();
			//l.swapping();
			//l.arrayIteration();
	}

}
