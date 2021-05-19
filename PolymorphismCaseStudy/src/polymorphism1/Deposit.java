package polymorphism1;

public class Deposit extends Transaction {
	
	private double amt;
	
	public double getAmount() {
		return amt;
	}

	public void setAmount(double amt) {
		this.amt = amt;
	}

	public void Execute()
	{
		System.out.println("Transaction Executing....");
		System.out.println(this.amt+" Deposited");
	}

}
