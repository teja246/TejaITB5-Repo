package com.Sample;

public class Bigbasket {

	static String catName="electronics";
	
	public void Billing() {
		System.out.println(" BigBasket  Invoice..");
		Double fruitsCost=fruits(Category.fruits);
		System.out.println("fruits Rs."+fruitsCost);
		Double snacksCost=snacks(Category.snacks);
		System.out.println("snacks Rs."+snacksCost);
		Double totalBill=fruitsCost+snacksCost;
		System.out.println("-----------------------");
		System.out.println("Total Rs."+totalBill);
	}
	public double fruits(String fruits) {
		double fruits_price=450.50;
		double totalPrice=gst(fruits_price,fruits);
		return totalPrice;
	}
	public double  snacks(String snacks) {
		double snacks_price=500.50;
		double totalPrice=gst(snacks_price,snacks);
		return totalPrice;
	}
	public double gst(double priceofItem,String item) {
		double gst;
		if(item.equals("Fruits & Vegetables")) {
		 gst=1.12;
		}else if(item.equals("Snacks & Branded Foods")) {
		gst=1.15;	
		}else {
			gst=1.18;
		}
		double totalAmount=gst*priceofItem;
		return totalAmount;
	}
	public static void main(String[] args) {
		Bigbasket bb=new Bigbasket();
		bb.Billing();

	}

}
