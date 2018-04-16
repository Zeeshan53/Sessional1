
public class GoldAccount extends BasicAccount{
	String  id, accountnumber;
	double balance =1000000;
	public GoldAccount(String id, String accountnumber,double balance)
	{
		super(id,accountnumber,balance);
	}
	public void display()
	{

		System.out.println("The ID of the customer is = "+getid()+
		"\n"+"The AccountNumber of the customer is = "+getaccountnumber()+"\n"
		+"The Balance of the customer is = "+getbalance());
	}
	public void withdrawal()
	{
		double totalamount = 100000;
		if(balance < totalamount)
		{
			System.out.println("The total amount is here " + totalamount+"PKR");
			double withdr = totalamount - balance;
			System.out.println("The amount withdrawn is = " + withdr +"PKR");
			double newbalance = balance;
			setbalance(newbalance);
			System.out.print("The remaining Balance is = " + newbalance+"PKR");
		}
		else
		{
			System.out.println("Amount Exceeded the limit");
		}
	}

}
