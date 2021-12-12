package com.Goods;

public class Amazon {	
	public void electronics(String tvName,Double price) {
		gst(price);
	    Double totalPrice=gst(price);
		System.out.println("tvname.. "+tvName+" price.. "+totalPrice);
		System.out.println("brand   "+Brand.brandName);
	}	
	public void computers(String compName,Double price) {
	Double totalPrice=gst(price);
		System.out.println("computerName "+compName+"  price.. "+totalPrice);
	}
	public double gst(Double price) {
		double gst=1.18;
		Double totalAmount=price*gst;
		return totalAmount;
	}
	public static void welcome() {
		System.out.println("welcome to Amazon..");
	}	
public static void main(String[] args) {	
	  Amazon am=new Amazon(); 
	  am.electronics("Thomson",20000.55);
	  am.computers("AVITA", 31000.45);
	Amazon.welcome();
}
}
