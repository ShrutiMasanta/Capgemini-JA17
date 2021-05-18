package javacore8labbook;
import java.util.Scanner;
public class NumberOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	    boolean flag = false;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number : ");
	    num = sc.nextInt();
	    int currentDigit = num % 10;
	    num = num/10;
	    while(num>0)
	    {
	    	if(currentDigit <= num % 10)
	    	{
	               flag = true;
	               break;
	        }
	    	currentDigit = num % 10;
	           num = num/10;
	    }
	    if(flag)
	    {
	           System.out.println("Digits are not in increasing order.");
	    }
	    else
	    {
	           System.out.println("Digits are in increasing order.");
	    }
	    sc.close();
   }

}