package com.capgemini.javacore8labbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumber {
	
	public static void main(String[] args) throws FileNotFoundException {
		int i=1;
		   Scanner keyboard = new Scanner(System.in);
		   System.out.print("Enter a File Name: ");
		   String filename = keyboard.nextLine();

		   File file = new File(filename);
		   Scanner inputFile = new Scanner(file);
		   String line = inputFile.nextLine();
		  
		  while (inputFile.hasNext()){
		  String name = inputFile.nextLine();

		    System.out.println(i+ ","+name);
		    i++;
		  } 
		  inputFile.close();
		  keyboard.close();
	}

}
