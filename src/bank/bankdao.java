package bank;
import java.util.ArrayList;
public class bankdao {
	ArrayList<BankUserAccount> userarrayAccounts = new ArrayList<BankUserAccount>();
	public void create(BankUserAccount newuser) {
		userarrayAccounts.add(newuser);
	}
	public void read() {
		for (BankUserAccount i : userarrayAccounts) {
			System.out.println("_________________________");
			System.out.println();
			System.out.println(i.getfirstname());
			System.out.println(i.getlastname());
			System.out.println(i.getaccountnumber());
			System.out.println(i.getssn());
			System.out.println(i.getemail());
			System.out.println(i.getbalance());
			System.out.println(i.getphonenumber());
			System.out.println();
			System.out.println("_________________________");
		}
	}
	
	public void update(BankUserAccount newuser) {
		userarrayAccounts.add(newuser);
	}
	public void delete(BankUserAccount newuser) {
		userarrayAccounts.add(newuser);
	}
	
	
}
