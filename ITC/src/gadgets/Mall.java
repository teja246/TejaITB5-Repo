package gadgets;

public class Mall {

	int min_balance=1000;
	int customer_balance=200;
    boolean is_creditcard_holder=false;
	public void welcome() {
		
		if(min_balance<=customer_balance) {
			System.out.println("welcome to PVR Mall  minbal");	
		}else if(is_creditcard_holder) {
			System.out.println("welcome to PVR mall credit");
		}
		else {
			System.out.println("sorry you don't have sufficient balance");
		}
		
	}
	
	public static void main(String[] args) {
		Mall m=new Mall();
		m.welcome();

	}

}
