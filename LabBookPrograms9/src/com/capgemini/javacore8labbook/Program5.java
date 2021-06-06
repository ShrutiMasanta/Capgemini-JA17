package com.capgemini.javacore8labbook;

import java.util.Scanner;

public class Program5 {
	
	public static int calculateFact(int num) {
		int result = 1;
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		DemoProgram5 obj= Program5::calculateFact;
		obj.fact(sc.nextInt());
	}

}
