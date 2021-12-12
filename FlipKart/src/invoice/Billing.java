package invoice;

public class Billing {
	
double totalItemsCost;
double totalPrice;	

public void creatingInvoice() {	
System.out.println("welcome to Flipkart......");
  double fashionBill=fashoinBill();
  System.out.println("Fashoin Bill ** "+fashionBill);
  double mobileBill=mobileBilling();
  System.out.println("Mobile  Bill ** "+mobileBill);
  double freshBill=freshBilling();
  System.out.println("fresh   Bill ** "+freshBill);
  double totalBill=fashionBill+mobileBill+freshBill;
  System.out.println("----------------------------");
  System.out.println("Total   Bill ** "+totalBill);
  System.out.println("Thank you! visit again..");
}

	public double fashoinBill() {
		double shirt=550.50;
		double pant=800;
		double blazer=2000;
		 totalItemsCost=shirt+pant+blazer;	
		  totalPrice=gst(totalItemsCost, Categories.fashion);
		return totalPrice;	
	}
	
	public double mobileBilling() {
		double redmi=12000;
		double oppo=22000;
		double onePlus=47000;
		 totalItemsCost=redmi+oppo+onePlus;
		 totalPrice=gst(totalItemsCost, Categories.mobiles);
		return totalPrice;
	}
	public double freshBilling() {
		double apple=120;
		double graph=60;
		double mango=150;
		 totalItemsCost=apple+graph+mango;
		                                   //"vegetables&fruits"
		 totalPrice=gst(totalItemsCost, Categories.fresh);
		return totalPrice;
	}
	
	public double gst(double totalCost,String catagery) {
		double gst;
		double total;
		System.out.println("Total itemsCost **"+totalCost);
		if(catagery.equals("vegetables&fruits")) {
			 gst=(totalCost*15)/100;
			 System.out.println("gst% is.."+gst);
			 total=totalCost+gst;
			return total;
		}else if(catagery.equals(Categories.mobiles)){
			 gst=(totalCost*17)/100;
			 System.out.println("gst% is.."+gst);
			 total=totalCost+gst;
			return total;
		}else if(catagery.equals(Categories.fashion)){
			 gst=(totalCost*20)/100;
			 System.out.println("gst% is.."+gst);
			 total=totalCost+gst;
			return total;
		}else {
			 gst=(totalCost*18)/100;
			 System.out.println("gst% is.."+gst);
			 total=totalCost+gst;
			return total;
		}
	}
	
	
	public static void main(String[] args) {
		Billing b=new Billing();
		        b.creatingInvoice();
	}
}
