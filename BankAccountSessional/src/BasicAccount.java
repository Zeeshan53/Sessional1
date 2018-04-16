
public class BasicAccount implements InterfaceofAccount {
	String  id, accountnumber;
	double balance;
	public BasicAccount(String id, String accountnumber,double balance)
	{
		this.accountnumber=accountnumber;
		this.id=id;
		this.balance=balance;
	}
	public void setid(String a){
		id = a;
		
	}
	public String getid()
	{
		return id;
	}
	public void setaccountnumber(String a)
	{
		accountnumber = a;

	}
	public String getaccountnumber()
	{
		return accountnumber;
	}
	public void setbalance(double v)
	{
		balance = v;
	}
	public double getbalance()
	{
		return balance;
	}
	public void display()
	{

		System.out.println("The ID of the customer is = "+getid()+
		"\n"+"The AccountNumber of the customer is = "+getaccountnumber()+"\n"
		+"The Balance of the customer is = "+getbalance());
	}
	public void withdrawal()
	{
		double totalamount = 10000;
		if(balance < totalamount)
		{
			System.out.println("The total amount is here " + totalamount+"PKR");
			double withdr = totalamount - balance;
			System.out.println("The amount withdrawn is = " + withdr+"PKR" );
			double newbalance = balance;
			setbalance(newbalance);
			System.out.print("The remaining Balance is = " + newbalance+"PKR");
		}
		else
		{
			System.out.println("No amount withdrawn");
		}
	}


}
