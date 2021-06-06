package com.capgemini.javacore8labbook;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoProgam1 obj = ()->{
			 Scanner s = new Scanner(System.in);
			 System.out.println("Enter x and y values: ");
	     return (long) Math.pow(s.nextInt(), s.nextInt());
		};
		System.out.println("x power y is: "+obj.powerOfX());

	}

}
