package bank;

public class PersonalLoanAgent {

	public static void main(String[] args) {
		AccountDetails ad=new AccountDetails();
		ad.setAccount_holder("Samba");
		ad.setIFSC("AXIS1245");
		ad.setAccount_holder("samba siva");
		//ad.setBalance(1234);
		System.out.println(ad.getAccount_holder());
		System.out.println(ad.getIFSC());
		System.out.println(ad.getBalance());
	}
}
