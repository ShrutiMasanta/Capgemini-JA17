package com.capgemini.javacore8labbook3;

import java.util.Scanner;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the salary of employee ---->");		
		Scanner sc = new Scanner(System.in);
		
		int salary = sc.nextInt();
		try {
			if(salary<3000)
			{
				throw new EmployeeException("Exception");
			}
			System.out.println("The salary is = "+salary);
		}
		catch(EmployeeException e)
		{
			System.out.println("Caught exception - Salary is below 3000");
		}
		sc.close();

	}

}
