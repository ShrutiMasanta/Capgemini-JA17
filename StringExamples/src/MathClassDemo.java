import java.util.Scanner;
public class MathClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		System.out.println("Cube Root = "+Math.cbrt(num));
		System.out.println("square Root = "+Math.sqrt(num));
		System.out.println("PI Value = "+Math.PI);
		System.out.println("Absolute Value of number ="+Math.abs(num));
		System.out.println("Enter the Float Number");
		float num1= sc.nextFloat();
		System.out.println("Floor Value = "+Math.floor(num1));
		System.out.println("Floor Value = "+Math.ceil(num1));
		System.out.println("Cos 90 Value = "+Math.cos(90));
		System.out.println("Sin 0 Value = "+Math.sin(0));
		sc.close();
		

	}

}
