package com.Location;

public class Uniliver {



	public static void main(String[] args) {
Uniliver un=new Uniliver();
Uniliver un1=new Uniliver();
		
int i=65;
char c=(char) i;

System.out.println(c);
	String s="Teja";
		
    String s1=new String("Teja");
    
    String s2="Teja";
    
    String s3=new String("Teja");
    
    System.out.println(s1.hashCode());
    System.out.println(s3.hashCode());
    
    System.out.println(s.equals(s1));
    System.out.println(s==s1);//literal & objecti
    System.out.println(s==s2);//literals
    System.out.println(s1==s3);//object & Object
    
  
	}

}
