package bank;
import java.util.ArrayList;
public class frontend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankdao abc =new bankdao();
		
		
		BankUserAccount leiAccount=new BankUserAccount();
		leiAccount.setfirstname("lei");
		leiAccount.setlastname("sun");
		leiAccount.setaccountnumber(1234910);
		leiAccount.setbalance(500);
		leiAccount.setmail("dasdasdasdasdasd@gmail.com");
		leiAccount.setphonenumber("6726768901");
		leiAccount.setssn(56366675);
		
		leiAccount.withdraw(1000);
		abc.create(leiAccount);
		
		abc.read();
	}

}
