
public class PremiumAccount extends GoldAccount{
	double balance =100000; // can be PKR or $
	private GoldAccount goldaccount;
	String id;
	String accountnumber;
	
	public PremiumAccount(String id,String accountnumber,double balance,GoldAccount goldaccount,BasicAccount basicaccount)
	{
		super(id,accountnumber,balance, basicaccount);
		this.goldaccount=goldaccount;
	}
	public void display()
	{

		System.out.println("The ID of the customer is = "+getid()+
		"\n"+"The AccountNumber of the customer is = "+getaccountnumber()+"\n"
		+"The Balance of the customer is = "+getbalance());
	}
	public void withdrawal()
	{
		goldaccount.withdrawal();
		double totalamount = 50000;
		if(balance < totalamount)
		{
			System.out.println("The total amount is here " + totalamount);
			double withdr = totalamount - balance;
			System.out.println("The amount withdrawn is =  PKR" + withdr );
			double newbalance = balance;
			System.out.println("The Amount Deposited is");
			setbalance(newbalance);
			System.out.print("The remaining Balance is = " + newbalance);
		}
		else
		{
			System.out.println("No amount withdrawn");
		}
	
	}
}
