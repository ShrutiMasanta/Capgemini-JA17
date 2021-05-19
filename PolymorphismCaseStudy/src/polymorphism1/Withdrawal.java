package polymorphism1;

public class Withdrawal {
	
	private double amt;

	public double getAmount() {
		return amt;
	}

	public void setAmount(double amt) {
		this.amt = amt;
	}
	
	 
	public void Execute()
	{
		System.out.println("Withdrawal Executing.... ");
		System.out.println(this.amt+" Withdrawn");
	}

	public void setAccNo(int accNo) {
		// TODO Auto-generated method stub
		
	}
	
}
