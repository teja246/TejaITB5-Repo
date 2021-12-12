package gadgets;

public class Mobiles {

	
	public void productInfo() {	
	
		String name="REDMIK";
		Double cost=120.55;
	String mobileName=mobileName();
	System.out.println("mobile name is.. "+mobileName);	
	
	long modelNumber=modelNum();
	System.out.println("model number is.."+modelNumber);
	
	double mobilePrice=price();
	System.out.println("mobile price is.."+mobilePrice);
	}
	
	public String mobileName() {
		String mobileName="SAMSUNG";
		return mobileName;
	}
	public long modelNum() {
		return 1356;
	}
	public double price() {
		double actualCost=1000.50;
		double gst=250.50;
		double tax=100.00;
		double price=actualCost+gst+tax;
		return price;
	}
	
	
	public static void main(String[] args) {
		Mobiles mob=new Mobiles();
		mob.productInfo();
	
	}

}
