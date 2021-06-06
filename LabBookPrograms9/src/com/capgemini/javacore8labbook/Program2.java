package com.capgemini.javacore8labbook;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoProgam2 obj = ()->{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			return sc.next().replace(""," ").trim();
		};
		System.out.println("Output string: "+ obj.addSpace());

	}

}
