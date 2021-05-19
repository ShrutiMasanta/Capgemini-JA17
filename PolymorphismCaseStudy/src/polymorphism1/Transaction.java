package polymorphism1;

public class Transaction {
	private int accNo;

	public long getAccno() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public void Execute()
	{
		System.out.println("Transaction Execution in process.....");
	}

}
