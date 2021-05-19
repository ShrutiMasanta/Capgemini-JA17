package polymorphism2;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Admin Name: ");
		String Admn_name = sc.next();
		System.out.println("Enter Admin Salary: ");
		double Admn_sal = sc.nextDouble();
		
		System.out.println("Enter Lecturer Name: ");
		String lec_name = sc.next();
		System.out.println("Enter Lecturer Salary: ");
		double lec_sal = sc.nextDouble();
		
		Admin ad = new Admin();
		ad.setName(Admn_name);
		ad.setSalary(Admn_sal);
		ad.adjustSalary(40000);
		
		Academic a = new Academic();
		a.setName(lec_name);
		a.setSalary(lec_sal);
		a.adjustSalary(60000);
		
		sc.close();

	}

}
