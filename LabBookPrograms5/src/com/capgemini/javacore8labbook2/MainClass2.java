package com.capgemini.javacore8labbook2;

import java.util.Scanner;

import com.capgemini.javacore8labbook.InvalidInputException;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name and Last name --->");
		String first = sc.next();
		String last = sc.next();
		System.out.println("Fname--->"+ first + "\n");
		System.out.println("Fname--->"+ last  + "\n");
		try {
			if(first==null || last==null)
			{
				throw new InvalidInputException("Exception");
			}
			System.out.println("Fullname is= "+first+" "+last);
		}
		catch(InvalidInputException e)
		{
			System.out.println("Plz enter the name correctly");
		}
		sc.close();

	}

}
