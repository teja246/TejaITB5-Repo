package bank;

public class AccountDetails {

	private int account_num=113872387;
	private String account_holder="Jayaram";
	private String IFSC="HDFC23491";
	private Double balance=250.50;
	
	public int getAccount_num() {
		return account_num;
	}
	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}
	public String getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public Double getBalance() {
		return balance;
	}
	private void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
