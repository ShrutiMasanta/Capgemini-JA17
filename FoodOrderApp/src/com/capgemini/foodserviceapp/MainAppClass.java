package com.capgemini.foodserviceapp;

import java.util.Scanner;

public class MainAppClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vendor v=new Vendor();
		v.dbConnection();
		Menu m=new Menu();
		m.dbConnection();
		Customer c=new Customer();
		c.dbConnection();
		Order o=new Order();
		o.dbConnection();
		char cont='y';
		while(cont=='y') {
			System.out.println("Enter the choice : ");
			System.out.println("1: Create table ");
			System.out.println("2: Register customer details");
			System.out.println("3: Login for customer to place an order");
			System.out.println("4: Display all order deatils");
			System.out.println("5: Display all customers");
			System.out.println("6: Exit");
			int transaction=sc.nextInt();
			switch(transaction) {
				case 1:
					//CREATING THE VENDOR TABLE and inserting values
					v.createTableVendor();
					v.insertVendor();
					//CREATING THE MENU TABLE and inserting values
					m.createTableMenu();
					m.insertMenu();
					//CREATING THE CUSTOMER TABLE
					c.createTableCustomer();
					//CREATING THE ORDER TABLE
					o.createTableOrder();
					break;
				case 2:
					c.registerCustomer();
					break;
				case 3:
					c.loginCustomer();
					break;
				case 4:
					o.display();
					break;
				case 5:
					c.displayCustomer();
					break;
				case 6:
					System.out.println("Thank you for visiting ");
					System.exit(0);
				default:
					break;
			}//switch close
			System.out.println("Do you want to continue?");
			cont=sc.next().trim().charAt(0);
		}//while
	}//main

}
