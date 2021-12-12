package details;

public class PersonalDtls {
String name="Teja";
String mail="Teja@gmail.com";
Long mobile=7013781152L;
AccountDtls accountDtls=null;

public void dtls() {
	accountDtls=new AccountDtls();
	System.out.println(name);
	System.out.println(mail);
	System.out.println(mobile);
	System.out.println("===Account Dtls======");
	System.out.println(accountDtls.Branch);
	System.out.println(accountDtls.IFSC);
	System.out.println(accountDtls.accNum);
}

public static void main(String[] args) {
	PersonalDtls pd=new PersonalDtls();
	pd.dtls();
}
}
