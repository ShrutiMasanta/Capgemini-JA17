package com.capgemini.javacore8labbook;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoProgram3 obj = ()->{
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter username: ");
			 String userName = sc.next();
			 System.out.println("Enter password");
			 String passWord = sc.next();
			 if(userName.equals("Sree") && passWord.equals("User1")) 
				 return true;
			return false;
			};
			if(obj.checkUserName())
				System.out.println("Valid user name and password");
			else
				System.out.println("Invalid credentials");

	}

}
