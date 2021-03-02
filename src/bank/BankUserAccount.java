package bank;

public class BankUserAccount {
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	private int ssn;
	private int accountnumber;
	private double balance;
	
	public String getfirstname() {
		return firstname;
	}
	public  void setfirstname(String firstname) {
		this.firstname=firstname;
	}
	
	public String getlastname() {
		return lastname;
	}
	public  void setlastname(String lastname) {
		this.lastname=lastname;
	}
	public String getemail() {
		return email;
		
	}
	public void setmail(String email)
	{
		this.email=email;
	}
	public String getphonenumber() {
		return phonenumber;
		
	}
	public void setphonenumber(String phonenumber)
	{
		this.phonenumber=phonenumber;
	}
	public int getssn() {
		return ssn;
		
	}
	public void setssn(int ssn)
	{
		this.ssn=ssn;
	}
	public int getaccountnumber() {
		return accountnumber;
		
	}
	public void setaccountnumber(int accountnumber)
	{
		this.accountnumber=accountnumber;
	}
	public double getbalance() 
	{
		return balance;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	//deposite method
		public void deposite(double num) {
			double newbalance = balance +num;
			balance=newbalance;
			System.out.println(balance);}
		//withdraw method 
		
		public void withdraw(double num) {
			double newbalance= balance - num;
			if (newbalance<0)
			{
				System.out.println("insufficient fund");
				System.out.println("balance: "+balance);
			}
			else {
			balance=newbalance;
			System.out.println(balance);
			}}
		
		//information method
		public void info() {
			System.out.println("name: "+firstname+" "+lastname);
			System.out.println("email: "+email);
			System.out.println("phone: "+phonenumber);
			System.out.println("account number: "+accountnumber);
		}
}
