package encapsulation;

public class SBI {
	private int acnt_bal;

	public int getAcnt_bal() {
		return acnt_bal;
	}

	public void setAcnt_bal(int acnt_bal) {
		this.acnt_bal = acnt_bal;
	}
}
class Customer1
{
	public static void main(String[] args) {
		SBI s=new SBI();
		s.setAcnt_bal(1000);
		int x = s.getAcnt_bal();
		System.out.println(x);
	}
}
