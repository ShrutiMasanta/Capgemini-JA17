package javacore8labbook;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		b = s.nextInt();
		System.out.println("------Prime Numbers upto"+" "+b+"---------");
		for(int i=2; i<b; i++)
		{
			a=0;
			for(int j=2; j<i; j++)
			{
				if(i%j ==0)
				a=1;
			}
			
			if(a==0)
				
				System.out.println(i);
		}
		s.close();
		
	}
	
}
