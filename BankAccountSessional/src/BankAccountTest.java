
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicAccount a = new BasicAccount("abc1","123vc",2000);
		a.display();
		a.withdrawal();
		GoldAccount g = new GoldAccount("GOLD1","con12",15000);
		g.withdrawal();
	}

}
