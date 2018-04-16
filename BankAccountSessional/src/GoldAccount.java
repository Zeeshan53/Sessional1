
public class GoldAccount extends BasicAccount{
	String  id, accountnumber;
	double balance =100000;
	private BasicAccount basicaccount;//Object Creation here
	public GoldAccount(String id, String accountnumber,double balance,BasicAccount basicaccount)
	{
		super(id,accountnumber,balance);
		this.basicaccount=basicaccount;
	}
	public void display()
	{

		System.out.println("The ID of the customer is = "+getid()+
		"\n"+"The AccountNumber of the customer is = "+getaccountnumber()+"\n"
		+"The Balance of the customer is = "+getbalance());
	}
	public void withdrawal()
	{
		basicaccount.withdrawal();
		double totalamount = 100000;
		if(balance < totalamount)
		{
			System.out.println("The total amount is here " + totalamount+"PKR");
			double withdr = totalamount - balance;
			System.out.println("The amount withdrawn is = " + withdr +"PKR");
			double newbalance = balance;
			System.out.println("The Amount Deposited is");
			setbalance(newbalance);
			System.out.print("The remaining Balance is = " + newbalance+"PKR");
		}
		else
		{
			System.out.println("\n"+" Amount Exceeded the limit");
		}
	}

}
