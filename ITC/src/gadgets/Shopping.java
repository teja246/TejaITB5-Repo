package gadgets;

public class Shopping {

	public void Cloths(String shirtDrand,Double cost) {
		double totalCost=price(cost);
		System.out.println("brand "+shirtDrand+"   Totalcost  "+totalCost);
	}
	public double price(double actualCost) {
		double gst=0.5;
		double totalCost=actualCost*gst;
		return totalCost;
	}
	public static void main(String[] args) {
		Shopping sh=new Shopping();
		sh.Cloths("polo",1500.55);
	}

}
