package polymorphism1;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account No : ");
		int accNo = sc.nextInt();
		
		System.out.println("Enter Deposit Amount: ");
		int deposit_amt = sc.nextInt();
		
		System.out.println("Enter Withdrawal Amount.: ");
		int withdrawal_amt = sc.nextInt();
		
		
		BalanceEnquiry be = new BalanceEnquiry();
		be.Execute();
		
		Deposit d = new Deposit();
		d.setAccNo(accNo);
		d.setAmount(deposit_amt);
		d.Execute();
		
		Withdrawal w = new Withdrawal();
		w.setAccNo(accNo);
		w.setAmount(withdrawal_amt);
		w.Execute();
		
		sc.close();

	}

}
