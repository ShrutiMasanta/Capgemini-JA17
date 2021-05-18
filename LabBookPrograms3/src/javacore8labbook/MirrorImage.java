package javacore8labbook;
import java.util.Scanner;
public class MirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String here---->");
		String str = sc.next();
		getImage(str);
		sc.close();
	}
	
	static void getImage(String str){
		
		String string=str;
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(string + "|" + reverse);
		
	}

}
